/**
 * 
 */
package pt.vhpp.algorithms.graph.paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import pt.vhpp.datatypes.SimpleGraphNode;

/**
 * @author Vitor Pereira
 *
 */
class ShortestPathDijkstraTest {
    private SimpleGraphNode[] graph;

    @Before
    public void setUp() throws Exception {
        graph = null; 
    }

    @Test
    void testSimpleDiGraph() {
        graph = GraphPathTestUtils.sampleGraphOne(); 
        ShortestPathDijkstra algorithm = new ShortestPathDijkstra(graph,0);
        assertEquals(0, 0);
        assertEquals(4, algorithm.getPathCost(1));
        assertEquals(12, algorithm.getPathCost(2));
        assertEquals(19, algorithm.getPathCost(3));
        assertEquals(21, algorithm.getPathCost(4));
        assertEquals(11, algorithm.getPathCost(5));
        assertEquals(9, algorithm.getPathCost(6));
        assertEquals(8, algorithm.getPathCost(7));
        assertEquals(14, algorithm.getPathCost(8));
    }

}
