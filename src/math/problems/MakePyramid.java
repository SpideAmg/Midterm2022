package math.problems;

public class MakePyramid {

    /*
     * Original Code:
     *
     * package math.problems;
     *
     * public class MakePyramid {
     *
     *         /*   Implement a large Pyramid of stars in the screen with java.
     *
     *               *
     *              * *
     *             * * *
     *            * * * *
     *           * * * * *
     *          * * * * * *
     *
     *          */
     *         public static void makePyramid ( int n){
     *
     *             for (int i = 0; i < n; i++) {
     *                 for (int j = n - i; j > 1; j--) {
     *                     System.out.print(" ");
     *                 }
     *                 for (int j = 0; j <= i; j++) {
     *                     System.out.print("* ");
     *                 }
     *                 System.out.println();
     *             }
     *
     *         }
     *
     *         public static void main(String[]args){
     *             int n = 6;
     *             makePyramid(6); // Original call
     *
     *         }
     *     }
     */

    /**
     * Prints a pyramid of stars to the console.
     * Example for n = 6:
     *           *
     *          * *
     *         * * *
     *        * * * *
     *       * * * * *
     *      * * * * * *
     * @param n The number of rows in the pyramid.
     */
    public static void makePyramid(int n) {
        if (n <= 0) {
            System.out.println("Pyramid height (n) must be a positive number.");
            return;
        }

        // Loop for each row
        for (int i = 0; i < n; i++) {
            // Loop for leading spaces
            // For row i (0-indexed), there are (n - 1 - i) leading spaces
            // if each star and following space takes two characters effectively,
            // or (n - 1 - i) single spaces if the pyramid is more compact.
            // The original code's (n - i) > 1 condition for spaces is equivalent to (n - i - 1) spaces.
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" "); // One space for alignment
            }

            // Loop for printing stars in the current row
            // For row i (0-indexed), there are (i + 1) stars
            for (int k = 0; k <= i; k++) {
                System.out.print("* "); // Star followed by a space
            }

            // Move to the next line after printing all stars for the current row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 6; // Define the number of rows for the pyramid
        System.out.println("Making a pyramid with " + n + " rows:");
        makePyramid(n); // Call makePyramid with the variable n

        System.out.println("\nMaking a pyramid with 3 rows:");
        makePyramid(3);

        System.out.println("\nMaking a pyramid with 0 rows (edge case):");
        makePyramid(0);

        System.out.println("\nMaking a pyramid with -2 rows (edge case):");
        makePyramid(-2);

    }
}
