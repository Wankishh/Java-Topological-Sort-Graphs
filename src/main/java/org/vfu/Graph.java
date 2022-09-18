package org.vfu;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private final List<List<Integer>> list;
    private final int size;

    public Graph(int n) {
        size = n;
        list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
    }

    public int getSize() {
        return size;
    }

    public void addDirectedEdge(Edge edge) {
        list.get(edge.getStartVertex())
                .add(edge.getEndVertex());
    }

    public List<List<Integer>> getNodes() {
        return list;
    }

    public List<Integer> getNode(int i) {
        return list.get(i);
    }
}
