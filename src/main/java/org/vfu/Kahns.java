package org.vfu;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Kahns {
    public int[] getTopologicalOrder(Graph graph) {
        int size = graph.getSize();

        int[] inDegree = new int[size];
        for (List<Integer> edges : graph.getNodes()) {
            for (int to : edges) {
                inDegree[to]++;
            }
        }

        Queue<Integer> q = new ArrayDeque<>();

        // Pass in the Queue all nodes without incoming Edges
        for (int i = 0; i < size; i++) {
            if (inDegree[i] == 0) {
                q.offer(i);
            }
        }

        int index = 0;
        int[] order = new int[size];

        while (!q.isEmpty()) {
            int at = q.poll();
            order[index++] = at;
            for (int to : graph.getNode(at)) {
                inDegree[to]--;
                if (inDegree[to] == 0) {
                    q.offer(to);
                }
            }
        }

        if (index != size) {
            throw new IllegalArgumentException("Detected a cycle. Graph is not DAG");
        }

        return order;
    }
}
