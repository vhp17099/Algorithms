package pt.vhpp.algorithms.graph.paths;

import java.util.LinkedList;
import java.util.List;

import pt.vhpp.datatypes.SimpleGraphEdge;
import pt.vhpp.datatypes.SimpleGraphNode;

public class GraphPathTestUtils {
    // https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-using-set-in-stl/
    //      (1) - -8 - - (2) - - 7 - - (3)
    //     / |            | \           | \
    //    4  |            2   \         |  9
    //   /  11            |    \        |   \
    //  (0)  |           (8)     4      14  (4)
    //   \   |         /  |        \    |   /
    //    8  |     7      6         \   |  10
    //     \ |  /         |           \ | /
    //      (7)- - 1 - - (6) - - 2 - - (5)
    public static SimpleGraphNode[] sampleGraphOne() {
        List<SimpleGraphEdge> temp;
        SimpleGraphNode[] graph = new SimpleGraphNode[9];

        // 0 
        temp = new LinkedList<SimpleGraphEdge>();
        temp.add(new SimpleGraphEdge(1,4));
        temp.add(new SimpleGraphEdge(7,8));
        graph[0] = new SimpleGraphNode(0,temp);

        // 1
        temp = new LinkedList<SimpleGraphEdge>();
        temp.add(new SimpleGraphEdge(0,4));
        temp.add(new SimpleGraphEdge(2,8));
        temp.add(new SimpleGraphEdge(7,11));
        graph[1] = new SimpleGraphNode(1,temp);

        // 2
        temp = new LinkedList<SimpleGraphEdge>();
        temp.add(new SimpleGraphEdge(1,8));
        temp.add(new SimpleGraphEdge(3,7));
        temp.add(new SimpleGraphEdge(5,4));
        temp.add(new SimpleGraphEdge(8,2));
        graph[2] = new SimpleGraphNode(2,temp);

        // 3
        temp = new LinkedList<SimpleGraphEdge>();
        temp.add(new SimpleGraphEdge(2,7));
        temp.add(new SimpleGraphEdge(4,9));
        temp.add(new SimpleGraphEdge(5,14));
        graph[3] = new SimpleGraphNode(3,temp);

        // 4
        temp = new LinkedList<SimpleGraphEdge>();
        temp.add(new SimpleGraphEdge(3,9));
        temp.add(new SimpleGraphEdge(5,10));
        graph[4] = new SimpleGraphNode(4,temp);

        // 5
        temp = new LinkedList<SimpleGraphEdge>();
        temp.add(new SimpleGraphEdge(2,4));
        temp.add(new SimpleGraphEdge(3,14));
        temp.add(new SimpleGraphEdge(4,10));
        temp.add(new SimpleGraphEdge(6,2));
        graph[5] = new SimpleGraphNode(5,temp);

        // 6
        temp = new LinkedList<SimpleGraphEdge>();
        temp.add(new SimpleGraphEdge(5,2));
        temp.add(new SimpleGraphEdge(7,1));
        temp.add(new SimpleGraphEdge(8,6));
        graph[6] = new SimpleGraphNode(6,temp);

        // 7
        temp = new LinkedList<SimpleGraphEdge>();
        temp.add(new SimpleGraphEdge(0,8));
        temp.add(new SimpleGraphEdge(1,11));
        temp.add(new SimpleGraphEdge(6,1));
        temp.add(new SimpleGraphEdge(8,7));
        graph[7] = new SimpleGraphNode(7,temp);

        // 8
        temp = new LinkedList<SimpleGraphEdge>();
        temp.add(new SimpleGraphEdge(2,2));
        temp.add(new SimpleGraphEdge(6,6));
        temp.add(new SimpleGraphEdge(7,7));
        graph[8] = new SimpleGraphNode(8,temp);
        
        return graph;
    }

}
