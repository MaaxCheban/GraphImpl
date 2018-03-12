package com.approach1;

/**
 * Created by MAX on 12.03.2018.
 */
public class Node<V> {
    V name; // Vertex name
    int weight;

    public Node(V name, int weight) {
        super();
        this.name = name;
        this.weight = weight;
    }

    public V getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "(" + this.weight + ")" + this.name;
    }
}