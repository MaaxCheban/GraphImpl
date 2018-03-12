package com.Graph;

        import java.util.*;

/**
 * Created by MAX on 12.03.2018.
 */
public class Graph<V> {
    private List<Vertex<V>> vertexes;
    private List<Edge<V>> edges;

    public Graph() {
        super();
        this.vertexes = new ArrayList<>();
        this.edges = new ArrayList<>();
    }

    public List<Vertex<V>> getVertexes() {
        return vertexes;
    }

    public List<Edge<V>> getEdges() {
        return edges;
    }
}
