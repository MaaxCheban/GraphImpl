package com;

import com.approach1.Graph;
import com.approach1.Node;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Graph<String> graph = new Graph<>();
        graph.addNewNode("Bangalore", new Node<>("SFO", 100));
        graph.addNewNode("Bangalore", new Node<>("HongKong", 50));
        graph.addNewNode("Bangalore", new Node<>("LA", 70));
        graph.addNewNode("LA", new Node<>("SFO", 20));
        graph.addNewNode("HongKong", new Node<>("LA", 60));

        graph.print();

        System.out.println(" Path between Bangalore and LA exists ? :"
                + graph.hasRelationship("Bangalore", "LA"));
    }
}
