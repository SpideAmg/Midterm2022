package math.problems;

// Commenting out unused imports if ConnectToSqlDB is fully removed from main logic
// import databases.ConnectToSqlDB;
// import java.util.ArrayList;
// import java.util.List;
import java.util.Arrays; // For printing array if needed

public class LowestNumber {

    /*
     * Original Code:
     *
     * package math.problems;
     *
     * import databases.ConnectToSqlDB;
     *
     * import java.util.ArrayList;
     * import java.util.List;
     *
     * public class LowestNumber {
     *
     *  public static void main(String[] args) {
     *      /*
     *       * Write java solution to find the lowest number from this array.
     *       * Use one of the databases from mysql or mongodb to store and to retrieve.
     *       */
     *      int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
     *
     *      //find lowest number from the array
     *
     *      ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
     *      List<String> lowestValue = new ArrayList<String>();
     *      try {
     *          connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
     *          lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");
     *
     *      } catch (Exception e) {
     *          e.printStackTrace();
     *      }
     *      System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
     *      for(String st:lowestValue){
     *          System.out.println(st);
     *      }
     *  }
     *
     * }
     */

    public static void main(String[] args) {
        /*
         * Write java solution to find the lowest number from this array.
         */
        int[] array = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

        System.out.println("Original array: " + Arrays.toString(array));

        // Find the lowest number using Java logic
        int lowest = findLowest(array);

        if (lowest == Integer.MAX_VALUE) {
            System.out.println("The array is empty or null, could not find the lowest number.");
        } else {
            System.out.println("The lowest number in the array is: " + lowest);
        }

        /*
         * The original code also included database interaction.
         * As per the plan, this part is commented out to focus on the Java solution first.
         * If database storage of the result is required, it would be a separate step
         * after finding the number.
         *
         * ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
         * List<String> lowestValue = new ArrayList<String>(); // This would store strings, not the int directly
         * try {
         *     // To store the found lowest number, you would typically insert the 'lowest' variable,
         *     // not the whole array if the goal is to store the "lowest number".
         *     // Example: connectToSqlDB.insertDataFromStringToSqlTable(String.valueOf(lowest), "tbl_lowestNumber_result", "lowest_value_column");
         *     // The original code inserted the whole array and then read it back, which isn't finding the lowest number in Java.
         *
         *     // Original database interaction (for reference of what was there):
         *     // connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
         *     // lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");
         *
         * } catch (Exception e) {
         *     e.printStackTrace();
         * }
         * // Original print message, which seems to be a copy-paste error from another context:
         * // System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
         * // for(String st:lowestValue){
         * //    System.out.println(st);
         * // }
         */
    }

    /**
     * Finds the lowest number in an array of integers.
     *
     * @param array The array of integers.
     * @return The lowest number found in the array.
     *         Returns Integer.MAX_VALUE if the array is null or empty.
     */
    public static int findLowest(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MAX_VALUE; // Or throw an IllegalArgumentException
        }

        int lowest = array[0]; // Assume the first element is the lowest initially
        for (int i = 1; i < array.length; i++) {
            if (array[i] < lowest) {
                lowest = array[i];
            }
        }
        return lowest;
    }
}
