package com.test;

import com.approach1.Graph;
import com.approach1.Vertex;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMain {
    @Test
    public void testExecute() {
        assertEquals(2+2,4);
    }

    @Test
    public void testPath(){
        Graph<String> graph = new Graph<>();

        assertTrue(graph.isEmpty());
        graph.addNewNode("Bangalore", new Vertex<>("SFO"));
        assertTrue(graph.hasRelationship("Bangalore", "SFO"));

        assertFalse(graph.isEmpty());
        assertFalse(graph.hasRelationship("Bangalore", "LA"));

        graph.addNewNode("Bangalore", new Vertex<>("HongKong"));
        assertTrue(graph.hasRelationship("Bangalore", "HongKong"));

        graph.deleteNode("Bangalore", new Vertex<>("HongKong"));
        assertFalse(graph.hasRelationship("Bangalore", "HongKong"));

;
    }


}
