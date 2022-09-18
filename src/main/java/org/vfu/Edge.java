package org.vfu;

public class Edge {
    private int startVertex;

    private int endVertex;

    public Edge(int start, int end) {
        startVertex = start;
        endVertex = end;
    }

    public int getStartVertex() {
        return startVertex;
    }

    public int getEndVertex() {
        return endVertex;
    }
}
