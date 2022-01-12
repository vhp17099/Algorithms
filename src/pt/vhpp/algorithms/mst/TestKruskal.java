package pt.vhpp.algorithms.mst;

import java.util.LinkedList;
import java.util.List;

import pt.vhpp.datatypes.SimpleGraphArc;

public class TestKruskal {
    private static void printHeader() {
        System.out.println("#################################################################");
        System.out.println("#                                                               #");
        System.out.println("#          Minimum Spanning Tree via Kruskal Algorithm          #");
        System.out.println("#                                                               #");
        System.out.println("#   By: Vitor Pereira                                   2022    #");
        System.out.println("#                                                               #");
        System.out.println("#################################################################");
    }

    private static void printIntro() {
        System.out.println(" This implementation of Kruskal algorithm to solve the Minimum Spanning Tree");
        System.out.println(" is open for anyone that wishes to undersand and use it.");
        System.out.println("");
        System.out.println(" The example of usage will be based on a SWERC 2007 problem named IP-TV.");
        System.out.println(" http://ctp.di.fct.unl.pt/~amd/cpn/2007swerc/official/problems/H/H.html");
        System.out.println("");
        System.out.println(" Note: The problem description will also be inside the code of this class.");
        System.out.println("");
    }

    private static void doIPTV() {
        // Usually here you would do code for input reading, and pretty output
        // I'll leave that to you if you wish to submit to somewhere online :)
        // this is just an example
        System.out.println("Input dataset for this example will be:");
        System.out.println("- 4 cities : Lisbon, London, Paris, Berlin");
        System.out.println("- 5 Links with: CityA CityB Cost");
        System.out.println("lisbon london 6");
        System.out.println("lisbon paris 5");
        System.out.println("london paris 1");
        System.out.println("paris berlin 10\n");

        String[] cities = new String[] {"lisbon","london","paris","berlin"};
        List<SimpleGraphArc> links = new LinkedList<SimpleGraphArc>();
        links.add(new SimpleGraphArc(0,1,6));
        links.add(new SimpleGraphArc(0,2,5));
        links.add(new SimpleGraphArc(1,2,1));
        links.add(new SimpleGraphArc(1,3,2));
        links.add(new SimpleGraphArc(2,3,10));

        MinimumSpanningTreeKruskal mst = new MinimumSpanningTreeKruskal(links,4);
        List<SimpleGraphArc> result = mst.getMinimumSpanningTree();

        System.out.println("Result, total mst cost:");
        System.out.println(mst.getCostOfMinimumSpanningTree());
        for(SimpleGraphArc arc : result) {
            System.out.println(cities[arc.getA()]+" - "+cities[arc.getB()]+" : "+arc.getCost());
        }
    }

    public static void main(String[] args) {
        printHeader();
        printIntro();
        doIPTV();
    }
}

/*
    SWERC 2007 Problem H - IP-TV

    Background
    A consortium of European Internet providers manages a large backbone network, with direct links (connections) between a large number of European cities. A link between a pair of cities is bidirectional. The transmission of a message in a link has an associated cost. As it is common in the Internet, it is possible to use a (unbounded) sequence of direct links to indirectly transfer data between any pair of cities.
    For allowing the broadcast of TV programs using this backbone, it is necessary to continuously send data to all nodes in the network. For helping to minimize costs, it is necessary to select the network links that will be used for transmitting data. The set of selected links must be connected and include all nodes in the network.
    For helping the consortium to manage its network, you have been asked to create a program that computes the minimum cost for transmitting data to all cities of the backbone.

    Problem
    Given a set of network links, compute the minimum transmission cost for reaching all nodes.

    Input
    The first line of the input contains a positive integer M, not greater than 2,000, with the number of cities that have network connections. The second line contains an integer N not greater than 50,000, with the number of existing links. Each of the following N lines contains the representation of a link. Each line contains two strings and one integer, separated by empty spaces, B E C, where B and E are the city names of the endpoints of the network link, with no more than 8 characters, and C is a positive integer, not greater than 30, representing the cost of transmitting in the link.

    Output
    The output consists of one single line that contains an integer with the minimum transmission cost for sending data to all cities.

    Sample Input
    4
    5
    lisbon london 6
    lisbon paris 5
    london paris 1
    london berlin 2
    paris berlin 10

    Sample Output
    8
     */
