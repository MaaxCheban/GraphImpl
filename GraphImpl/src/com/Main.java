package com;

import com.Graph.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Graph<String> graph = new Graph<String>();
        graph.addNewNode("Bangalore", new Node<String>("SFO", 100));
        graph.addNewNode("Bangalore", new Node<String>("HongKong", 50));
        graph.addNewNode("Bangalore", new Node<String>("LA", 70));
        graph.addNewNode("LA", new Node<String>("SFO", 20));
        graph.addNewNode("HongKong", new Node<String>("LA", 60));

        graph.print();

        System.out.println(" Path between Bangalore and LA exists ? :"
                + graph.hasRelationship("Bangalore", "LA"));

        System.out.println("------");
        graph.findShortestWay("Bangalore", "SFO");
    }
}
