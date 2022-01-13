package pt.vhpp.algorithms.graph.span;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class TopologicalSortKahnTest {

    @Test
    void testSimpleWikipediaExample() {
        // https://en.wikipedia.org/wiki/Topological_sorting#Examples
        List<Integer> sorted = TopologicalSortKahn.performTopologicalSort(GraphSpanTestUtils.simpleDiGraph());
        assertEquals("[0, 1, 2, 3, 4, 5, 7, 6]", sorted.toString());
    }

    // TODO : More tests
}
