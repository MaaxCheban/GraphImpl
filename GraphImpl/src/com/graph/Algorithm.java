package com.graph;

import java.util.List;

/**
 * Created by MAX on 12.03.2018.
 */
public interface Algorithm<V>{
    List<Vertex<V>> getPath(Vertex target);
    void execute(Vertex<V> source);
}
