package inge2.dataflow.pointstoanalysis;

import soot.jimple.*;
import soot.jimple.internal.JInstanceFieldRef;
import soot.jimple.internal.JimpleLocal;

import java.util.HashSet;
import java.util.Set;

public class PointsToVisitor extends AbstractStmtSwitch<Void> {

    private final PointsToGraph pointsToGraph;

    public PointsToVisitor(PointsToGraph pointsToGraph) {
        this.pointsToGraph = pointsToGraph;
    }

    @Override
    public void caseAssignStmt(AssignStmt stmt) {
        boolean isLeftLocal = stmt.getLeftOp() instanceof JimpleLocal;
        boolean isRightLocal = stmt.getRightOp() instanceof JimpleLocal;

        boolean isLeftField = stmt.getLeftOp() instanceof JInstanceFieldRef;
        boolean isRightField = stmt.getRightOp() instanceof JInstanceFieldRef;

        boolean isRightNew = stmt.getRightOp() instanceof AnyNewExpr;

        if (isRightNew) { // x = new A()
            processNewObject(stmt);
        } else if (isLeftLocal && isRightLocal) { // x = y
            processCopy(stmt);
        } else if (isLeftField && isRightLocal) { // x.f = y
            processStore(stmt);
        } else if (isLeftLocal && isRightField) { // x = y.f
            processLoad(stmt);
        }
    }

    private void processNewObject(AssignStmt stmt) {
        String leftVariableName = stmt.getLeftOp().toString();
        Node nodeName = pointsToGraph.getNodeName(stmt);

        Set<Node> variableNodes = pointsToGraph.getNodesForVariable(leftVariableName);
        variableNodes.add(nodeName);
        pointsToGraph.setNodesForVariable(leftVariableName, variableNodes); // si hace referencia en vez de copia creo que se rompe
    }

    private void processCopy(AssignStmt stmt) {
        String leftVariableName = stmt.getLeftOp().toString();
        String rightVariableName = stmt.getRightOp().toString();

        Set<Node> rightVariableNodes = pointsToGraph.getNodesForVariable(rightVariableName);
        pointsToGraph.setNodesForVariable(leftVariableName, rightVariableNodes);

    }

    private void processStore(AssignStmt stmt) { // x.f = y
        JInstanceFieldRef leftFieldRef = (JInstanceFieldRef) stmt.getLeftOp();
        String leftVariableName = leftFieldRef.getBase().toString();
        String fieldName = leftFieldRef.getField().getName();
        String rightVariableName = stmt.getRightOp().toString();

        Set<Node> rightVariableNodes = pointsToGraph.getNodesForVariable(rightVariableName);
        Set<Node> leftVariableNodes = pointsToGraph.getNodesForVariable(leftVariableName);
        for (Node leftVariableNode : leftVariableNodes) {
            for (Node rightVariableNode : rightVariableNodes) {
                pointsToGraph.addEdge(leftVariableNode, fieldName, rightVariableNode);
            }
        }
    }

    private void processLoad(AssignStmt stmt) { // x = y.f
        String leftVariableName = stmt.getLeftOp().toString();
        JInstanceFieldRef rightFieldRef = (JInstanceFieldRef) stmt.getRightOp();
        String rightVariableName = rightFieldRef.getBase().toString();
        String fieldName = rightFieldRef.getField().getName();

        Set<Node> rightVariableNodes = pointsToGraph.getNodesForVariable(rightVariableName);
        Set<Node> newVariableNodes = new HashSet<>();
        for (Node rightVariableNode : rightVariableNodes) {
            Set<Node> nodesReachedByField = pointsToGraph.getReachableNodesByField(rightVariableNode, fieldName);
            newVariableNodes.addAll(nodesReachedByField);
        }
        pointsToGraph.setNodesForVariable(leftVariableName, newVariableNodes);
    }
}
