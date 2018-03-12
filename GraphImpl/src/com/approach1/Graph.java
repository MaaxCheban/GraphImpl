package com.approach1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by MAX on 12.03.2018.
 */
public class Graph<V> {
    // Vertex i.e. V gets mapped to list of all connecting Nodes.
    Map<V, List<Vertex<V>>> adjacencyList;
    int verticesCount;
    int edgeCount;

    public Graph() {
        super();
        this.adjacencyList = new HashMap<>();
    }

    /**
     * Add a new node for the given vertex.
     * Vertex to node connection forms Edge.
     *
     * @param vertex
     * @param node
     */
    public void addNewNode(V vertex, Vertex<V> node) {
        List<Vertex<V>> vertices = adjacencyList.get(vertex);
        if (vertices == null || vertices.isEmpty()) {
            vertices = new ArrayList<Vertex<V>>();
            vertices.add(node);
        } else {
            vertices.add(node);
        }
        adjacencyList.put(vertex, vertices);
    }

    /**
     * Takes two vertices and checks if there is a path between v1 and v2.
     * Doesn't take vice-versa.
     *
     * @param v1 first vertex
     * @param v2 second vertex
     * @return
     */
    public boolean hasRelationship(V v1, V v2) {
        if (v1 == null && v2 == null)
            return true;
        if (v1 != null && v2 == null)
            return true;
        if (v1 == null && v2 != null)
            return false;

        List<Vertex<V>> vertices = null;

        if (adjacencyList.containsKey(v1)) {
            vertices = adjacencyList.get(v1);
            if (vertices != null || !vertices.isEmpty()) {
                for (Vertex<V> v : vertices) {
                    if (v.getName().equals(v2))
                        return true;
                }
            }
        }
        return false;
    }

    public void print() {
        System.out.println("approach1 is --->");
        for (V v : adjacencyList.keySet()) {
            System.out.println(v + " --- " + adjacencyList.get(v));
        }
    }
}
