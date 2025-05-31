package math.problems;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    /*
     * Original Code:
     *
     * package math.problems;
     *
     * public class Fibonacci {
     *     public static void main(String[] args) {
     *          /*
     *           Write 40 Fibonacci numbers with java.
     *           0,1,1,2,3,5,8,13
     *          */
     *
     *         int num = 40;
     *         int fibo = -1;
     *         int s = 1;
     *
     *         // System.out.println(f);
     *         // System.out.println(s);
     *         for (int i = 1; i <= num; i++) {
     *             int r = fibo + s;
     *             //  System.out.println(t);
     *             fibo = s;
     *             s = r;
     *             System.out.println(r);
     *         }
     *     }
     * }
     */

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          Output should be: 0,1,1,2,3,5,8,13,...
         */
        int count = 40;
        System.out.println("Generating " + count + " Fibonacci numbers:");
        List<Long> fibonacciSequence = generateFibonacciSequence(count);

        for (int i = 0; i < fibonacciSequence.size(); i++) {
            System.out.print(fibonacciSequence.get(i));
            if (i < fibonacciSequence.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    /**
     * Generates a list of Fibonacci numbers up to the given count.
     * Uses long to prevent overflow for larger Fibonacci numbers.
     * @param count The number of Fibonacci numbers to generate.
     * @return A List<Long> containing the Fibonacci sequence.
     */
    public static List<Long> generateFibonacciSequence(int count) {
        List<Long> sequence = new ArrayList<>();
        if (count <= 0) {
            return sequence; // Return empty list for non-positive count
        }

        long a = 0L;
        long b = 1L;

        if (count >= 1) {
            sequence.add(a);
        }
        if (count >= 2) {
            sequence.add(b);
        }

        for (int i = 3; i <= count; i++) {
            long next = a + b;
            sequence.add(next);
            a = b;
            b = next;
        }
        return sequence;
    }
}
