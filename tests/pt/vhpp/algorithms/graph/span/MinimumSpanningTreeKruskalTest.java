/**
 * 
 */
package pt.vhpp.algorithms.graph.span;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
    /**
     * @throws java.lang.Exception
     */
    @BeforeEach
    void setUp() throws Exception {
    }


    @Test
    void testSWERC07IPTV() {
        List<SimpleGraphArc> graphArcs = GraphSpanTestUtils.swerc07IPTVDataSet();
        MinimumSpanningTreeKruskal mst = new MinimumSpanningTreeKruskal(graphArcs,GraphSpanTestUtils.swerc07IPDataSetGraphSize());

        List<SimpleGraphArc> result = mst.getMinimumSpanningTree();
        assertNotNull(result);
        assertEquals(3, result.size());

        assertEquals(8, mst.getCostOfMinimumSpanningTree());
    }

}
