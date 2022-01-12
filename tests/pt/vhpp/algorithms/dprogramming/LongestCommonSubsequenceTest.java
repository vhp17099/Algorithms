package pt.vhpp.algorithms.dprogramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestCommonSubsequenceTest {

    @Test
    void testSimpleStrings1() {
        String a = "AGGTAB";
        String b = "GXTXAYB";
        
        LongestCommonSubsequence lcs = new LongestCommonSubsequence(a, b);
        assertEquals(4, lcs.getLength());
        assertEquals("GTAB", lcs.getValue());
    }

    @Test
    void testSmallDNAStrings() {
        String a = "ACCGGTCGAGTGCGCGGAAGCCGGCCGAA";
        String b = "GTCGTTCGGAATGCCGTTGCTCTGTAA";

        LongestCommonSubsequence lcs = new LongestCommonSubsequence(a, b);
        assertEquals(20, lcs.getLength());
        assertEquals("GTCGTCGGAAGCCGGCCGAA", lcs.getValue());
    }
}
