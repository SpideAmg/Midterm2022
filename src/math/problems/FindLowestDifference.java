package math.problems;

public class FindLowestDifference {

    /*
     * Original Code:
     *
     * package math.problems;
     *
     * public class FindLowestDifference {
     *     public static void main(String[] args) {
     *         /*
     *          Implement in java.
     *          Read this below two array. Find the lowest difference between the two array cell.
     *          The lowest difference between cells is 1
     *         */
     *         int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
     *         int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
     *
     *         System.out.println("lowest diff is: " + lower(array1, array2));
     *
     *     }
     *
     *     public static int lower(int[] array1, int[] array2) {
     *
     *         int lowMIN = Integer.MAX_VALUE;
     *         int difference = 0;
     *
     *         for (int i = 0; i < array1.length; i++) {
     *             for (int j = 0; j < array2.length; j++) {
     *                 difference = Math.abs(array1[i] - array2[j]);
     *                 if (difference < lowMIN) {
     *                     lowMIN = difference;
     *                 }
     *             }
     *         }
     *         // System.out.println(lowMIN);
     *
     *         return lowMIN;
     *     }
     * }
     */

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1 (example output for the given arrays)
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        // It's good practice to handle potential empty arrays, though not explicitly requested.
        // For this exercise, we'll assume arrays are non-empty as per original code.

        int lowestDifference = findLowestDifference(array1, array2);
        System.out.println("The lowest difference between cells is: " + lowestDifference);
    }

    /**
     * Finds the lowest absolute difference between any two elements from two arrays.
     *
     * @param arr1 The first array of integers.
     * @param arr2 The second array of integers.
     * @return The lowest absolute difference found. Returns Integer.MAX_VALUE if either array is null or empty.
     */
    public static int findLowestDifference(int[] arr1, int[] arr2) {
        if (arr1 == null || arr1.length == 0 || arr2 == null || arr2.length == 0) {
            // Or throw an IllegalArgumentException, depending on desired behavior
            return Integer.MAX_VALUE;
        }

        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int currentDifference = Math.abs(arr1[i] - arr2[j]);
                if (currentDifference < minDifference) {
                    minDifference = currentDifference;
                }
            }
        }
        return minDifference;
    }
}
