package com.approach1;

public class Edge<V> {
    private Node<V> source;
    private Node<V> destination;
    int weight;

    public Edge(Node<V> source, Node<V> destination, int weight) {
        super();
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public Node<V> getSource() {
        return source;
    }

    public Node<V> getDestination() {
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