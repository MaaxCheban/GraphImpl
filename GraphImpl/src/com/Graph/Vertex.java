package com.Graph;

/**
 * Created by MAX on 12.03.2018.
 */
public class Vertex<V> {
    private V name;

    public Vertex(V name) {
        this.name = name;
    }

    public V getName() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 :
                name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vertex other = (Vertex) obj;
        if(!name.equals(other.getName())) return false;


        return true;
    }

    @Override
    public String toString(){
        return name.toString();
    }
}