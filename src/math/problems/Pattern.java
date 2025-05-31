package math.problems;

public class Pattern {

    /*
     * Original Code:
     *
     * package math.problems;
     *
     * public class Pattern {
     *
     *  public static void main(String[] args) {
     *      /* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
     *       * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
     *       *
     *       *
     *       */
     *      for ( int i=100; i<=100 && i > 90; i-- ) {
     *          System.out.print(i + ",");
     *
     *      }
     *      for ( int i=90; i<=90 && i > 70; i-=2 ) {
     *          System.out.print(i + ",");
     *
     *      }
     *      for ( int i=70; i<=70 && i > 40; i-=3 ) {
     *          System.out.print(i + ",");
     *
     *      }
     *      for ( int i=40; i<=40 && i > 0; i-=4 ) {
     *          System.out.print(i + ",");
     *
     *      }
     *      System.out.print("...");
     *
     *  }
     * }
     */

    public static void main(String[] args) {
        /* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
         * Expected output: 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
         */

        System.out.println("Generating pattern:");
        generateAndPrintPattern();
    }

    /**
     * Generates and prints the specified number pattern.
     * The pattern segments are:
     * - 100 down to 91 (decrement by 1)
     * - 90 down to 72 (decrement by 2)
     * - 70 down to 43 (decrement by 3)
     * - 40 down to (not including 0, last term will be >0) (decrement by 4)
     */
    public static void generateAndPrintPattern() {
        StringBuilder patternString = new StringBuilder();

        // Part 1: 100 down to 91 (decrement by 1)
        // Loop condition: i > 90 means it stops when i is 90. So, 91 is the last printed.
        for (int i = 100; i > 90; i--) {
            patternString.append(i).append(",");
        }

        // Part 2: 90 down to 71 (decrement by 2)
        // Loop condition: i > 70 means it stops when i is 70. So, 72 is the last printed if i starts at 90.
        // Example: 90, 88, ..., 72
        for (int i = 90; i > 70; i -= 2) {
            patternString.append(i).append(",");
        }

        // Part 3: 70 down to 41 (decrement by 3)
        // Loop condition: i > 40 means it stops when i is 40. So, 43 is the last printed if i starts at 70.
        // Example: 70, 67, ..., 43
        for (int i = 70; i > 40; i -= 3) {
            patternString.append(i).append(",");
        }

        // Part 4: 40 down to positive (decrement by 4)
        // Loop condition: i > 0 means it stops when i is 0 or less.
        // Example: 40, 36, ..., 4 (if it started at 40)
        for (int i = 40; i > 0; i -= 4) {
            patternString.append(i).append(",");
        }

        // Remove the last comma if present and append "..."
        if (patternString.length() > 0) {
            patternString.setLength(patternString.length() - 1); // Remove trailing comma
        }
        patternString.append("...");

        System.out.println(patternString.toString());
    }
}
