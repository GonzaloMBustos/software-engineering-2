package inge2.dataflow.pointstoanalysis;

import soot.Unit;
import soot.jimple.AssignStmt;
import soot.tagkit.LineNumberTag;

import java.util.*;

public class PointsToGraph {

    /**
     * Nodos del grafo.
     *
     * Cada nodo representa todos los objetos creados por cada sentencia "new".
     * Es decir, tenemos un nodo por cada "new" en el programa.
     */
    public Set<Node> nodes;

    /**
     * Ejes del grafo.
     *
     * Un eje (n1, f, n2) indica que el los objetos representados por el nodo n1 tienen un campo f que apunta al/los
     * objetos representados por n2.
     */
    public Set<Axis> axis;

    /**
     * Mapping de variables locales a nodos.
     * Representa el conjunto de objetos a los que puede apuntar una variable local.
     */
    public Map<String, Set<Node>> mapping;

    public PointsToGraph(){
        nodes = new HashSet<>();
        axis = new HashSet<>();
        mapping = new HashMap<>();
    }

    public void clear() {
        nodes.clear();
        axis.clear();
        mapping.clear();
    }

    /**
     * Devuelve el nombre del nodo correspondiente a la sentencia <code>stmt</code>.
     * @param stmt
     * @return
     */
    public Node getNodeName(AssignStmt stmt) {
        LineNumberTag lineNumberTag = (LineNumberTag) stmt.getTag("LineNumberTag");
        return new Node(String.valueOf(lineNumberTag.getLineNumber()));
    }

    /**
     * Devuelve el conjunto de nodos a los que apunta la variable <code>variableName</code>.
     * @param variableName
     * @return
     */
    public Set<Node> getNodesForVariable(String variableName) {
        /*
        Para obtener los nodos apuntados por alguna variable es suficiente con obtener el value del mapping del grafo
        dado que representa el L(x), siendo x en este caso el variable name.
        **/
        return mapping.get(variableName);
    }

    /**
     * Setea el conjunto de nodos a los que apunta la variable <code>variableName</code>.
     * @param variableName
     * @param nodes
     */
    public void setNodesForVariable(String variableName, Set<Node> nodes) {
        /*
        Para setear aquellos nodos que apunta una variable, es necesario considerar que los nodos sean agregados por primera vez,
        por lo tanto deben ser agregados al conjunto de nodos N del grafo.
        A su vez, es necesario poder "conectar" la variable con los nodos, por lo tanto, actualizamos el mapping con el nombre
        de la variable y el conjunto de nodos al que apunta.
        En caso de que la variable ya existiera en el grafo y ya estuviera apuntando a nodos, esta funcion actualizaria
        por completo los nodos a los que apunta si el conjunto de nodos recibido por parametro no incluye ninguno de los anteriores.
        Esta funcionalidad es esperada, dado que se actualizan los nodos accesibles desde la variable.
        **/
        // como son conjuntos, agregar nodos no necesita chequearque no esten, dado que se encarga de los duplicados
        this.nodes.addAll(nodes);
        mapping.put(variableName, nodes);
    }

    /**
     * Agrega un eje al grafo.
     * @param leftNode
     * @param fieldName
     * @param rightNode
     */
    public void addEdge(Node leftNode, String fieldName, Node rightNode) {
        /*
        Para agregar un eje, es suficiente con crear el nuevo eje, en nuestro caso representado por el objeto Axis
        y agregarlo al conjunto axis del grafo que representa el conjunto E del PTG.
         */
        Axis newEdge = new Axis(leftNode, fieldName, rightNode);
        axis.add(newEdge);
    }

    /**
     * Devuelve el conjunto de nodos alcanzables desde el nodo <code>node</code> por el campo <code>fieldName</code>.
     * @param node
     * @param fieldName
     * @return
     */
    public Set<Node> getReachableNodesByField(Node node, String fieldName) {
        /*
        Para conseguir los nodos que estan referenciados desde un nodo a traves de un Field,
        es suficiente recorrer todos los elementos de axis (nuestro conjunto E de ejes), y como PTG es un grafo
        dirigido, obtener todos aquellos que el leftNode (es decir, el nodo de origen) sea igual al nodo provisto
        por parametro.
         */
        Set<Node> reachableNodes = new HashSet<>();
        for (Axis axis : axis) {
            if (axis.leftNode.equals(node) && axis.fieldName.equals(fieldName)) reachableNodes.add(axis.rightNode);
        }
        return reachableNodes;
    }

    /**
     * Copia de un grafo (modifica el this).
     * @param in
     */
    public void copy(PointsToGraph in) {
        this.clear();
        this.union(in);
    }

    /**
     * Union de dos grafos (modifica el this).
     * this = this U in
     * Recordar que hay que unir:
     * los nodos, los ejes y el supermo mapping de variables a nodos
     * @param in el grafo a unir
     */
    public void union(PointsToGraph in) {
        /*
        Para hacer la union de 2 grafos, es suficiente implementarlo tal como se define la union en el enunciado del taller
        donde G1 ∪ G2 = ⟨N1 ∪ N2 , E1 ∪ E2 , L1 ∪ L2 ⟩.
        Entonces simplemente unimos los conjuntos de Nodos N, y Ejes E, y los mappings de ambos, los unimos uno a uno, donde
        si la variable ya esta presente en ambos, unimos el conjunto de nodos al que apunta, y sino dejamos aquella que si
        tenga nodos apuntados desde la variable.
         */
        this.nodes.addAll(in.nodes);
        this.axis.addAll(in.axis);
        for (Map.Entry<String, Set<Node>> entry : in.mapping.entrySet()) {
            String key = entry.getKey();
            Set<Node> nodes = entry.getValue();

            if (mapping.containsKey(key)) {
                mapping.get(key).addAll(nodes);
            } else {
                mapping.put(key, new HashSet<>(nodes)); // Use a new set to avoid aliasing
            }
        }
    }
}
