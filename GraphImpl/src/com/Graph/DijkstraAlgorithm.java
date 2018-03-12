package com.Graph;

import java.util.*;

/**
 * Created by MAX on 12.03.2018.
 */
public class DijkstraAlgorithm<V> implements Algorithm<V>{

    private final List<Vertex<V>> nodes;
    private final List<Edge<V>> edges;
    private Set<Vertex<V>> settledNodes;
    private Set<Vertex<V>> unSettledNodes;
    private Map<Vertex<V>, Vertex> predecessors;
    private Map<Vertex<V>, Integer> distance;

    public DijkstraAlgorithm(Graph<V> graph) {
        // create a copy of the array so that we can operate on this array
        this.nodes = new ArrayList<Vertex<V>>(graph.getVertexes());
        this.edges = new ArrayList<Edge<V>>(graph.getEdges());
    }

    public void execute(Vertex<V> source) {
        settledNodes = new HashSet<Vertex<V>>();
        unSettledNodes = new HashSet<Vertex<V>>();
        distance = new HashMap<Vertex<V>, Integer>();
        predecessors = new HashMap<Vertex<V>, Vertex>();
        distance.put(source, 0);
        unSettledNodes.add(source);
        while (unSettledNodes.size() > 0) {
            Vertex<V> node = getMinimum(unSettledNodes);
            settledNodes.add(node);
            unSettledNodes.remove(node);
            findMinimalDistances(node);
        }
    }

    private void findMinimalDistances(Vertex node) {
        List<Vertex> adjacentNodes = getNeighbors(node);
        for (Vertex target : adjacentNodes) {
            if (getShortestDistance(target) > getShortestDistance(node)
                    + getDistance(node, target)) {
                distance.put(target, getShortestDistance(node)
                        + getDistance(node, target));
                predecessors.put(target, node);
                unSettledNodes.add(target);
            }
        }

    }

    private int getDistance(Vertex node, Vertex target) {
        for (Edge edge : edges) {
            if (edge.getSource().equals(node)
                    && edge.getDestination().equals(target)) {
                return edge.getWeight();
            }
        }
        throw new RuntimeException("Should not happen");
    }

    private List<Vertex> getNeighbors(Vertex node) {
        List<Vertex> neighbors = new ArrayList<Vertex>();
        for (Edge edge : edges) {
            if (edge.getSource().equals(node)
                    && !isSettled(edge.getDestination())) {
                neighbors.add(edge.getDestination());
            }
        }
        return neighbors;
    }

    private Vertex getMinimum(Set<Vertex<V>> vertexes) {
        Vertex<V> minimum = null;
        for (Vertex<V> vertex : vertexes) {
            if (minimum == null) {
                minimum = vertex;
            } else {
                if (getShortestDistance(vertex) < getShortestDistance(minimum)) {
                    minimum = vertex;
                }
            }
        }
        return minimum;
    }

    private boolean isSettled(Vertex vertex) {
        return settledNodes.contains(vertex);
    }

    private int getShortestDistance(Vertex destination) {
        Integer d = distance.get(destination);
        if (d == null) {
            return Integer.MAX_VALUE;
        } else {
            return d;
        }
    }

    /*
     * This method returns the path from the source to the selected target and
     * NULL if no path exists
     */
    public List<Vertex<V>> getPath(Vertex target) {
        LinkedList<Vertex<V>> path = new LinkedList<Vertex<V>>();
        Vertex step = target;
        // check if a path exists
        if (predecessors.get(step) == null) {
            return null;
        }
        path.add(step);
        while (predecessors.get(step) != null) {
            step = predecessors.get(step);
            path.add(step);
        }
        // Put it into the correct order
        Collections.reverse(path);
        return path;
    }

}
