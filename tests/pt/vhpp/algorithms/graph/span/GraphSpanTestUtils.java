package pt.vhpp.algorithms.graph.span;

import java.util.LinkedList;
import java.util.List;

import pt.vhpp.datatypes.SimpleGraphArc;

public class GraphSpanTestUtils {

    // https://en.wikipedia.org/wiki/Topological_sorting#Examples
    public static List<Integer>[] simpleDiGraph() {
        LinkedList<Integer>[] graph = new LinkedList[8]; 
        graph[0] = new LinkedList<Integer>();
        graph[0].add(3);
        graph[1] = new LinkedList<Integer>();
        graph[1].add(3);
        graph[1].add(4);
        graph[2] = new LinkedList<Integer>();
        graph[2].add(4);
        graph[2].add(7);
        graph[3] = new LinkedList<Integer>();
        graph[3].add(5);
        graph[3].add(6);
        graph[3].add(7);
        graph[4] = new LinkedList<Integer>();
        graph[4].add(6);
        graph[5] = new LinkedList<Integer>();
        graph[6] = new LinkedList<Integer>();
        graph[7] = new LinkedList<Integer>();
        return graph;
    }

    public static int simpleUndirectedNodeCount() { return 4; }
    public static List<SimpleGraphArc> simpleUndirectedGraph() {
        List<SimpleGraphArc> arcs = new LinkedList<SimpleGraphArc>();
        arcs.add(new SimpleGraphArc(0,1,4));
        arcs.add(new SimpleGraphArc(1,2,1));
        arcs.add(new SimpleGraphArc(2,3,2));
        arcs.add(new SimpleGraphArc(3,1,5));
        return arcs;
    }

    public static int swerc07IPDataSetGraphSize() { return 4;}
    public static List<SimpleGraphArc> swerc07IPTVDataSet() {
        // " The example of usage will be based on a SWERC 2007 problem named IP-TV."
        // http://ctp.di.fct.unl.pt/~amd/cpn/2007swerc/official/problems/H/H.html"

        // String[] cities = new String[] {"lisbon","london","paris","berlin"};
        List<SimpleGraphArc> links = new LinkedList<SimpleGraphArc>();
        links.add(new SimpleGraphArc(0,1,6));
        links.add(new SimpleGraphArc(0,2,5));
        links.add(new SimpleGraphArc(1,2,1));
        links.add(new SimpleGraphArc(1,3,2));
        links.add(new SimpleGraphArc(2,3,10));

        return links;
    }
}
