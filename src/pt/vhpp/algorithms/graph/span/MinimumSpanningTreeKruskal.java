package pt.vhpp.algorithms.graph.span;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

import pt.vhpp.datastructures.Partition;
import pt.vhpp.datatypes.SimpleGraphArc;

/**
 * @author Vitor Pereira
 * Minimum Spanning Tree via Kruskal Algorithm
 * 
 * This is a recycled implementation from the old SWERC competitions I used to participate in.
 * This implementation aims to be a mix between a quick implementation and a readable one for
 * someone that still needs to learn how to implement this Algorithm
 * 
 * Further information about the generic Kruskal Algorithm here : https://en.wikipedia.org/wiki/Kruskal%27s_algorithm
 * Further information on Union Find here: https://en.wikipedia.org/wiki/Disjoint-set_data_structure
 *
 */
public class MinimumSpanningTreeKruskal {
    private PriorityQueue<SimpleGraphArc> arcQueue;
    private Partition unionFind;
    private int totalNodes;

    private int costOfMinimumSpanningTree;
    private List<SimpleGraphArc> minimumSpanningTree;

    public MinimumSpanningTreeKruskal(List<SimpleGraphArc> arcs, int nodes) {
        unionFind = new Partition(arcs.size());
        arcQueue = new PriorityQueue<SimpleGraphArc>();
        arcQueue.addAll(arcs);
        totalNodes = nodes;

        costOfMinimumSpanningTree = 0;
        minimumSpanningTree = new LinkedList<SimpleGraphArc>();
        computeMinimumSpanningTree();
    }

    private void computeMinimumSpanningTree() {
        int maxSize = totalNodes-1;

        while(minimumSpanningTree.size() < maxSize) {
            SimpleGraphArc arc = arcQueue.poll();
            int disjointSetA = unionFind.find(arc.getA());
            int disjointSetB = unionFind.find(arc.getB());

            if( disjointSetA != disjointSetB) {
                unionFind.union(disjointSetA, disjointSetB);
                minimumSpanningTree.add(arc);
                costOfMinimumSpanningTree += arc.getCost();
            }
        }
    }

    public List<SimpleGraphArc> getMinimumSpanningTree(){
        return minimumSpanningTree;
    }

    public int getCostOfMinimumSpanningTree() {
        return costOfMinimumSpanningTree;
    }
}
