package com.graph;


import java.util.*;

/**
 * Created by MAX on 12.03.2018.
 */
public class Graph<V> {
    private List<Vertex<V>> vertexes;
    private List<Edge<V>> edges;
    private Scanner scanner;

    public int getVerticesCount() {
        return vertexes.size();
    }

    public int getEdgeCount() {
        return edges.size();
    }

    public Graph() {
        super();
        this.vertexes = new ArrayList<>();
        this.edges = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public List<Vertex<V>> getVertexes() {
        return vertexes;
    }

    public List<Edge<V>> getEdges() {
        return edges;
    }

    public void addVertex(Vertex<V> vertex){
        vertexes.add(vertex);
    }

    public void removeVertex(Vertex<V> vertex) {
        for (Edge<V> edge: edges) {
            if (edge.contain(vertex)){
                edges.remove(edge);
            }
        }
        vertexes.remove(vertex);
    }

    public void addEdge(Vertex<V> source, Vertex<V> dest, int weight){
        Edge<V> edge = new Edge<>(source, dest, weight);
        edges.add(edge);
    }

    public void removeEdge(Edge<V> edge){
        edges.remove(edge);
    }

    public List<Vertex<V>> findShortestWay(Algorithm algorithm){
        System.out.println("Print start position");
        String startPos = scanner.nextLine();

        System.out.println("Print destination");
        String dest = scanner.nextLine();

        algorithm.execute(new Vertex(startPos));
        return algorithm.getPath(new Vertex(dest));
    }


}
