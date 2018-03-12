package com;

import com.approach1.Graph;
import com.approach1.Vertex;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Graph<String> graph = new Graph<>();
        graph.addNewNode("Bangalore", new Vertex<>("SFO", 100));
        graph.addNewNode("Bangalore", new Vertex<>("HongKong", 50));
        graph.addNewNode("Bangalore", new Vertex<>("LA", 70));
        graph.addNewNode("LA", new Vertex<>("SFO", 20));
        graph.addNewNode("HongKong", new Vertex<>("LA", 60));

        graph.print();

        System.out.println(" Path between Bangalore and LA exists ? :"
                + graph.hasRelationship("Bangalore", "LA"));
    }
}
