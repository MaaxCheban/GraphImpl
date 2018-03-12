package com;

import com.graph.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Graph<String> graph = new Graph<>();

        graph.addVertex(new Vertex<>("Bangalore"));
        graph.addVertex(new Vertex<>("Hong Kong"));
        graph.addVertex(new Vertex<>("LA"));
        graph.addVertex(new Vertex<>("SFO"));

        graph.addEdge(new Vertex<>("Bangalore"), new Vertex<>("Hong Kong"), 50);
        graph.addEdge(new Vertex<>("Bangalore"), new Vertex<>("LA"), 70);
        graph.addEdge(new Vertex<>("Bangalore"), new Vertex<>("SFO"), 100);
        graph.addEdge(new Vertex<>("Hong Kong"), new Vertex<>("LA"), 60);
        graph.addEdge(new Vertex<>("LA"), new Vertex<>("SFO"), 20);

        DijkstraAlgorithm<String> algorithm = new DijkstraAlgorithm<>(graph);
        List<Vertex<String>> vertexes;
        vertexes = graph.findShortestWay(algorithm);

        for(Vertex vertex : vertexes ){
            System.out.println(vertex);
        }

    }
}
