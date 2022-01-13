package pt.vhpp.algorithms.mathematics;

/**
 * @author Vitor Pereira
 *
 *  Several Mathematic Algorithms that can be useful in some cases:
 *  - Euclid's Greatest Common Divisor O(n^2) : https://en.wikipedia.org/wiki/Greatest_common_divisor#Euclid's_algorithm
 *  - Least Common Multiple via Euclid's GCD O(n^2): https://en.wikipedia.org/wiki/Least_common_multiple#Using_the_greatest_common_divisor
 *  - Module Inverse via Euclid's GCD : https://en.wikipedia.org/wiki/Modular_multiplicative_inverse#Extended_Euclidean_algorithm
 */
public class MiscMathAlgorithms {
    
    public static long greatestCommonDivisor(long first, long second) {
        long t, a = first, b = second;
        if( a < b) {
            t = a;
            a = b;
            b = t;
        }
        while (b > 0) {
            t = a%b;
            a = b;
            b = t;
        }
        return a;
    }

    public static long leastCommonMultiple(long first, long second) {
        return first*second / greatestCommonDivisor(first, second);
    }

    public static int moduleInverse(int a, int n) {
        int i = n, v = 0, d = 1;
        while (a > 0) {
                   int t = i / a, x = a;
                   a = i % x;
                   i = x;
                   x = d;
                   d = v - t * x;
                   v = x;
        }
        v %= n;
        if (v<0) {
            v = (v + n) % n;
        }
        return v;
    }

    // TODO Permutations
    // TODO Combinations
}
