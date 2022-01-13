package pt.vhpp.algorithms.graph.span;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Vitor Pereira
 * 
 * Topological Sort of Graph nodes with Kahn's Algorithm: https://en.wikipedia.org/wiki/Topological_sorting#Kahn's_algorithm
 * 
 * Note: Unless the Graph has a Hamiltonian Path, there can be more than one solution
 */
public class TopologicalSortKahn {
    public static List<Integer> performTopologicalSort(List<Integer>[] graph) {
        int[] incoming = new int[graph.length];
        Queue<Integer> queue = new LinkedList<Integer>();
        List<Integer> result = new LinkedList<Integer>();

        for(int i = 0; i < graph.length; i++) {
            for(Integer to : graph[i]) {
                incoming[to]++;
            }
        }
        for(int i = 0; i < graph.length; i++) {
            if (incoming[i] == 0) {
                queue.offer(i);
            }
        }
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            result.add(curr);
            for(Integer to : graph[curr]) {
                if (--incoming[to] == 0) {
                    queue.offer(to);
                }
            }
        }

        // if topological sort has less than all nodes
        // then graph has cycle return null;
        return result.size() < graph.length ? null : result;
    }
}
