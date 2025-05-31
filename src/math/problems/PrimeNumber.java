package math.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumber {

    /*
     * Original Code:
     *
     * package math.problems;
     *
     * public class PrimeNumber {
     *
     *  public static void main(String[] args) {
     *      /*
     *       * Find list of Prime numbers from number 2 to 1 million.
     *       * Try the best solution as possible.Which will take less CPU life cycle.
     *       * Out put number of Prime numbers on the given range.
     *       *
     *       *
     *       * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     *       *
     *       */
     *
     *  }
     *
     * }
     */

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data. (Database part not implemented here)
         */

        int limit = 1000000; // One million
        System.out.println("Finding prime numbers up to " + limit + " using Sieve of Eratosthenes...");

        long startTime = System.currentTimeMillis();
        List<Integer> primes = findPrimesSieve(limit);
        long endTime = System.currentTimeMillis();

        System.out.println("Found " + primes.size() + " prime numbers.");
        System.out.println("Calculation took " + (endTime - startTime) + " milliseconds.");

        // Optional: Print a small subset of primes to verify, e.g., first 10 and last 10
        // if (primes.size() > 20) {
        //     System.out.print("First 10 primes: ");
        //     for (int i = 0; i < 10; i++) {
        //         System.out.print(primes.get(i) + " ");
        //     }
        //     System.out.println();
        //     System.out.print("Last 10 primes: ");
        //     for (int i = primes.size() - 10; i < primes.size(); i++) {
        //         System.out.print(primes.get(i) + " ");
        //     }
        //     System.out.println();
        // } else {
        //     System.out.println("Primes: " + primes);
        // }

        // The database storage part mentioned in the original comment is not implemented in this step.
        // That would typically involve taking the 'primes' list and writing it to a chosen database.
    }

    /**
     * Finds all prime numbers up to a given limit using the Sieve of Eratosthenes algorithm.
     *
     * @param limit The upper bound (inclusive) to search for prime numbers.
     * @return A List<Integer> containing all prime numbers from 2 up to the limit.
     */
    public static List<Integer> findPrimesSieve(int limit) {
        if (limit < 2) {
            return new ArrayList<>(); // No primes less than 2
        }

        // Create a boolean array "isPrime[0..limit]" and initialize
        // all entries it as true. A value in isPrime[i] will
        // finally be false if i is Not a prime, else true.
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false; // 0 is not prime
        isPrime[1] = false; // 1 is not prime

        for (int p = 2; p * p <= limit; p++) {
            // If isPrime[p] is not changed, then it is a prime
            if (isPrime[p]) {
                // Update all multiples of p greater than or equal to the square of it
                // numbers which are multiple of p and are less than p^2 are already been marked.
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Collect all prime numbers
        List<Integer> primeNumbers = new ArrayList<>();
        for (int p = 2; p <= limit; p++) {
            if (isPrime[p]) {
                primeNumbers.add(p);
            }
        }
        return primeNumbers;
    }
}
