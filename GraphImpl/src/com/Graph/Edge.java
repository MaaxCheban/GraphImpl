package com.Graph;

/**
 * Created by MAX on 12.03.2018.
 */
public class Edge<V> {
    private Vertex<V> source;
    private Vertex<V> destination;
    private int weight;

    public Edge(Vertex<V> source, Vertex<V> destination, int weight) {
        super();
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public Vertex<V> getSource() {
        return source;
    }

    public Vertex<V> getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Edge [source=" + source + ", destination=" + destination
                + ", weight=" + weight + "]";
    }
}
