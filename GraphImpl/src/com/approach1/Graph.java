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

    public void addNewNode(V vertex, Vertex<V> node) {
        List<Vertex<V>> vertices = adjacencyList.get(vertex);
        if (vertices == null || vertices.isEmpty()) {
            vertices = new ArrayList<>();
            vertices.add(node);
        } else {
            vertices.add(node);
        }
        adjacencyList.put(vertex, vertices);
    }

    public void deleteNode(V vertex, Vertex<V> node) {
        List<Vertex<V>> vertices = adjacencyList.get(vertex);
        if (vertices != null || !vertices.isEmpty()) {
            vertices.remove(node);
        } else {
            System.out.println("Something wrong");
        }
        adjacencyList.put(vertex, vertices);
    }

    public boolean hasRelationship(V v1, V v2) {
        if (v1 == null && v2 == null) {
            return true;
        }
        if (v1 != null && v2 == null) {
            return true;
        }

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

    public boolean isEmpty(){
        return adjacencyList.isEmpty();

    }

    public void print() {
        System.out.println("Graph is --->");
        for (V v : adjacencyList.keySet()) {
            System.out.println(v + " --- " + adjacencyList.get(v));
        }
    }
}
