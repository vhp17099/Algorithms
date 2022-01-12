/**
 * 
 */
package pt.vhpp.algorithms.graph.span;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pt.vhpp.datatypes.SimpleGraphArc;

/**
 * @author vitor
 *
 */
class MinimumSpanningTreeKruskalTest {
    private List<SimpleGraphArc> graphArcs;
    private int nodeCount;

    @BeforeEach
    void setUp() throws Exception {
        nodeCount = 0;
        graphArcs = null;
    }

    @Test
    void testSimpleUndirectedGraph() {
        graphArcs = GraphSpanTestUtils.simpleUndirectedGraph();
        nodeCount = GraphSpanTestUtils.simpleUndirectedNodeCount();
        MinimumSpanningTreeKruskal mst = new MinimumSpanningTreeKruskal(graphArcs, nodeCount);

        List<SimpleGraphArc> result = mst.getMinimumSpanningTree();
        assertNotNull(result);
        assertEquals(7, mst.getCostOfMinimumSpanningTree());

        SimpleGraphArc notUsed = graphArcs.get(3);
        for (SimpleGraphArc arc : result) {
            assertNotEquals(notUsed, arc);
        }
    }

    @Test
    void testSWERC07IPTV() {
        graphArcs = GraphSpanTestUtils.swerc07IPTVDataSet();
        nodeCount = GraphSpanTestUtils.swerc07IPDataSetGraphSize();
        MinimumSpanningTreeKruskal mst = new MinimumSpanningTreeKruskal(graphArcs,nodeCount);

        List<SimpleGraphArc> result = mst.getMinimumSpanningTree();
        assertNotNull(result);
        assertEquals(3, result.size());

        assertEquals(8, mst.getCostOfMinimumSpanningTree());
    }

}
