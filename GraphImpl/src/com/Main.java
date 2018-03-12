package com;

import com.approach1.Graph;
import com.approach1.Vertex;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Graph<String> graph = new Graph<>();

        graph.addNewNode("Bangalore", new Vertex<>("SFO"));
        graph.addNewNode("Bangalore", new Vertex<>("HongKong"));
        graph.addNewNode("Bangalore", new Vertex<>("LA"));
        graph.addNewNode("LA", new Vertex<>("SFO"));
        graph.addNewNode("HongKong", new Vertex<>("LA"));

        graph.print();

        System.out.println(" Path between Bangalore and LA exists ? :"
                + graph.hasRelationship("Bangalore", "LA"));
    }
}
