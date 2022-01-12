package pt.vhpp.algorithms.graph.span;

import java.util.LinkedList;
import java.util.List;

import pt.vhpp.datatypes.SimpleGraphArc;

public class GraphSpanTestUtils {

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
