package math.problems;

public class FindMissingNumber {

    /*
     * Original Code:
     *
     * package math.problems;
     *
     * public class FindMissingNumber {
     *
     *     public static void main(String[] args) {
     *         /*
     *          * If n = 10, then array will have 9 elements in the range from 1 to 10.
     *          * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
     *          * Write java code to find the missing number from the array. Write static helper method to find it.
     *          */
     *         int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
     *         int sum1 = 0;
     *
     *         for (int i = 1; i <= 10; i++) {
     *             sum1 = sum1 + i;
     *         }
     *         int sum2 = 0;
     *         for (int i = 0; i < array.length; i++) {
     *             sum2 = sum2 + array[i];
     *         }
     *         System.out.println("The missing number is" + " " + (sum1 - sum2));
     *     }
     * }
     */

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        // Assuming n is the length of the complete sequence (1 to n)
        // For the given array, the complete sequence would go up to array.length + 1
        int n = array.length + 1;

        int missingNumber = findMissing(array, n);
        System.out.println("Given array: {10, 2, 1, 4, 5, 3, 7, 8, 6}");
        System.out.println("The range of numbers is 1 to " + n + ".");
        System.out.println("The missing number is: " + missingNumber);
    }

    /**
     * Finds the missing number in an array containing numbers from 1 to n
     * with one number missing.
     *
     * @param array The array of integers, missing one number from the sequence.
     * @param n     The upper bound of the complete sequence (e.g., if numbers are 1-10, n is 10).
     * @return The missing number.
     */
    public static int findMissing(int[] array, int n) {
        // Calculate the expected sum of numbers from 1 to n
        int expectedSum = 0;
        for (int i = 1; i <= n; i++) {
            expectedSum += i;
        }
        // The formula for sum of first n natural numbers is n * (n + 1) / 2
        // int expectedSum = n * (n + 1) / 2;


        // Calculate the actual sum of numbers in the given array
        int actualSum = 0;
        for (int i = 0; i < array.length; i++) {
            actualSum += array[i];
        }

        return expectedSum - actualSum;
    }
}
