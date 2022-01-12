package pt.vhpp.datastructures;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vitor Pereira
 *
 * Prime Sieve Implementation: https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
 * 
 * Spatial O(n) Time O(n*log(log n))
 */
public class PrimeSieve {
    private boolean[] sieve; // False will be prime, True will not be prime
    private int totalPrimes;

    public PrimeSieve(int range) {
        sieve = new boolean[range];
        totalPrimes = 0;

        sieve[0] = sieve[1] = true; // Not Primes!

        for(int i = 2; i < sieve.length; i++) {
            if(!sieve[i]) {
                totalPrimes++;
                // J > 0 is only due to numbers exceeding Integer.MAX_VALUE and looping around
                for(int j = i*i; j < sieve.length && j > 0; j+=i) {
                    sieve[j] = true;
                }
            }
        }
    }

    public boolean isPrime(int number) {
        return !sieve[number];
    }

    public int getTotalPrimes() {
        return totalPrimes;
    }

    public String allPrimes() {
        // This can be pre built with the sieve algorithm to speed up
        List<Integer> primes = new ArrayList<Integer>(totalPrimes);

        primes.add(2);
        for(int i = 3; i < sieve.length ; i+=2) {
            if(!sieve[i]) {
                primes.add(i);
            }
        }
        
        return primes.toString();
    }
}
