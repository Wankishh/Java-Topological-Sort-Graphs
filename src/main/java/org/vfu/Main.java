package org.vfu;

public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph(7);

        graph.addDirectedEdge(new Edge(0, 1));
        graph.addDirectedEdge(new Edge(1, 6));
        graph.addDirectedEdge(new Edge(2, 3));
        graph.addDirectedEdge(new Edge(3, 5));
        graph.addDirectedEdge(new Edge(4, 5));
        graph.addDirectedEdge(new Edge(5, 6));

        Kahns kahns = new Kahns();

        int[] order = kahns.getTopologicalOrder(graph);

        System.out.println(java.util.Arrays.toString(order));
    }
}