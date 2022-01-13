package pt.vhpp.algorithms.mathematics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MiscMathAlgorithmsTests {

    @Test
    void testGreatestCommonDivisor() {
        assertEquals(4, MiscMathAlgorithms.greatestCommonDivisor(8, 12));
        assertEquals(3, MiscMathAlgorithms.greatestCommonDivisor(978, 8979876375489345795l));
        assertEquals(64290, MiscMathAlgorithms.greatestCommonDivisor(826062210, 317013990));
    }

    @Test
    void testLeastCommonMultiple() {
        assertEquals(75, MiscMathAlgorithms.leastCommonMultiple(15,75));
        assertEquals(1262665214717157l, MiscMathAlgorithms.leastCommonMultiple(15123123, 751431231));
    }

    @Test
    void testModuleinverse() {
        assertEquals(2, MiscMathAlgorithms.moduleInverse(6, 11));
        assertEquals(41, MiscMathAlgorithms.moduleInverse(676645, 116));
        assertEquals(5495, MiscMathAlgorithms.moduleInverse(676645123, 11654));
    }
}
