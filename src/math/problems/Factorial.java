package math.problems;

import java.util.Scanner;

public class Factorial {

    /*
     * Original Code:
     *
     * package math.problems;
     *
     * import java.util.Scanner;
     *
     * public class Factorial {
     *
     *     public static void main(String[] args) {
     *         /*
     *          * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
     *          * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
     *          *
     *          */
     *         N();
     *     }
     *
     *     public static int N() {
     *         Scanner Nm = new Scanner(System.in);
     *         System.out.println("enter any number for his Factorial");
     *         int n;
     *         n = Nm.nextInt();
     *         //int n = 5;
     *         int fact = 1;
     *         for (int i = 1; i <= n; i++) {
     *             fact = fact * i; // *=
     *             System.out.println(fact);
     *
     *         }
     *         return fact;
     *     }
     * }
     */

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial:");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Calculating factorial for: " + num);

            // Iterative approach
            long factorialIterative = calculateFactorialIterative(num);
            System.out.println("Factorial (Iterative): " + factorialIterative);

            // Recursive approach
            long factorialRecursive = calculateFactorialRecursive(num);
            System.out.println("Factorial (Recursive): " + factorialRecursive);
        }
        scanner.close();
    }

    /**
     * Calculates factorial iteratively.
     * @param n The non-negative integer.
     * @return The factorial of n.
     */
    public static long calculateFactorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    /**
     * Calculates factorial recursively.
     * @param n The non-negative integer.
     * @return The factorial of n.
     */
    public static long calculateFactorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0) {
            return 1; // Base case: 0! = 1
        }
        return n * calculateFactorialRecursive(n - 1); // Recursive step
    }
}
