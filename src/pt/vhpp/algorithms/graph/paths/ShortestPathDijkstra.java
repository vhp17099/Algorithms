package pt.vhpp.algorithms.graph.paths;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import pt.vhpp.datatypes.SimpleGraphEdge;
import pt.vhpp.datatypes.SimpleGraphNode;

public class ShortestPathDijkstra {
    private PriorityQueue<SimpleGraphEdge> pool;
    private SimpleGraphNode[] graph;
    private int[] length;
    private int[] path;
    private boolean[] selected;
    private int startPoint;

    public ShortestPathDijkstra(SimpleGraphNode[] graph, int startPoint) {
        this.graph = graph;
        runDijskra(startPoint);
    }

    private void expandNode(SimpleGraphNode node, int cost) {
        for (SimpleGraphEdge edge : node.getEdges()) {
            int nextNode = edge.getTo();
            if (!selected[nextNode]) {
                int newLength = cost+edge.getCost();
                if (newLength < length[nextNode]) {
                    // Remove any expansion to this node on the queue that has cost higher than this
                    if(length[nextNode] < Integer.MAX_VALUE) {
                        pool.remove(new SimpleGraphEdge(nextNode, length[nextNode]));
                    }

                    pool.offer(new SimpleGraphEdge(nextNode, newLength));
                    length[nextNode] = newLength;
                    path[nextNode] = node.getId();
                }
            }
        }
    }

    private void runDijskra(int startFrom) {
        selected = new boolean[graph.length];
        length = new int[graph.length];
        Arrays.fill(length, Integer.MAX_VALUE);
        path = new int[graph.length];
        startPoint = startFrom;
        length[startPoint] = 0;
        path[startPoint] = startPoint;
        selected[startPoint] = true;

        pool = new PriorityQueue<SimpleGraphEdge>(); // Needs initialization value for optimal use
        expandNode(graph[startPoint],0);

        do {
            SimpleGraphEdge current = pool.poll();
            selected[current.getTo()] = true;
            expandNode(graph[current.getTo()], current.getCost());
        } while(!pool.isEmpty());
    }

    public int getPathCost(int destination) {
        return length[destination];
    }

    public List<Integer> getShortestPath(int destination) {
        LinkedList<Integer> result = new LinkedList<Integer>();
        int current = destination;
        while (current != startPoint) {
            result.addFirst(current);
            current = path[current];
        }
        result.addFirst(current);
        return result;
    }
}
