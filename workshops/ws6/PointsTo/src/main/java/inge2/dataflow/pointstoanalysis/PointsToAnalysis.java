package inge2.dataflow.pointstoanalysis;

import soot.Unit;
import soot.toolkits.graph.UnitGraph;
import soot.toolkits.scalar.ForwardFlowAnalysis;

import java.util.HashSet;
import java.util.Set;

public class PointsToAnalysis extends ForwardFlowAnalysis<Unit, PointsToGraph> {

    private PointsToGraph lastPointsToGraph;

    public PointsToAnalysis(UnitGraph graph) {
        super(graph);
        doAnalysis();
    }

    public PointsToGraph getLastPointsToGraph() {
        return lastPointsToGraph;
    }

    /**
     * This method is called for each unit in the control flow graph.
     * @param in the input flow
     * @param unit the current node
     * @param out the returned flow
     */
    @Override
    protected void flowThrough(PointsToGraph in, Unit unit, PointsToGraph out) {
        out.copy(in);

        PointsToVisitor visitor = new PointsToVisitor(out);
        unit.apply(visitor);

        this.lastPointsToGraph = out;
    }

    @Override
    protected PointsToGraph newInitialFlow() {
        return new PointsToGraph();
    }

    /**
     * This method merges the two input flows into a single output flow.
     * @param input1 the first input flow
     * @param input2 the second input flow
     * @param output the returned flow
     */
    @Override
    protected void merge(PointsToGraph input1, PointsToGraph input2, PointsToGraph output) {
        output.copy(input1);
        output.union(input2);
    }

    @Override
    protected void copy(PointsToGraph source, PointsToGraph dest) {
        dest.copy(source);
    }

    /**
     * Retorna true si alguno de los objetos apuntados por leftVariableName y rightVariableName coinciden.
     * @param leftVariableName
     * @param rightVariableName
     * @return
     */
    public boolean mayAlias(String leftVariableName, String rightVariableName) {
        /*
        Para ver si existe aliasing entre 2 variables es sficiente con obtener todos los nodos a los que apunte cada una de
        ellas y ver si su interseccion es o no vacia.
        La funcion retainAll nos permite realizar esta interseccion, pero es necesario usar un conjunto temporal
        dado que la funcion actualiza el conjunto de la izquierda con la interseccion de ambos.
         */
        Set<Node> leftVariableNodes = lastPointsToGraph.getNodesForVariable(leftVariableName);
        Set<Node> rightVariableNodes = lastPointsToGraph.getNodesForVariable(rightVariableName);
        Set<Node> temp = new HashSet<>(leftVariableNodes);
        temp.retainAll(rightVariableNodes);
        return !temp.isEmpty();
    }

    /**
     * Retorna true si alguno de los objetos apuntados por leftVariableName.fieldName y rightVariableName coinciden.
     * @param leftVariableName
     * @param fieldName
     * @param rightVariableName
     * @return
     */
    public boolean mayAlias(String leftVariableName, String fieldName, String rightVariableName) {
        /*
        De la misma manera que con el mayAlias entre dos variables, usamos la misma idea de la interseccion
        y la misma funcion de retainAll, pero en este caso comparamos el conjunto de aquellos nodos que son alcanzables
        mediante los nodos apuntados por leftVariableName a traves del field fieldName, por lo que tenemos que conseguir primero
        el conjunto de todos estos nodos alcanzables y luego hacer la interseccion con los nodos alcanzables por la variable
        rightVariableName.
         */
        Set<Node> rightVariableNodes = lastPointsToGraph.getNodesForVariable(rightVariableName);
        Set<Node> leftVariableNodes = lastPointsToGraph.getNodesForVariable(leftVariableName);
        Set<Node> allReacheableNodeByField = new HashSet<>();
        for (Node leftVariableNode : leftVariableNodes) {
            Set<Node> nodesReachedByField = lastPointsToGraph.getReachableNodesByField(leftVariableNode, fieldName);
            allReacheableNodeByField.addAll(nodesReachedByField);
        }
        allReacheableNodeByField.retainAll(rightVariableNodes);
        return !allReacheableNodeByField.isEmpty();
    }
}
