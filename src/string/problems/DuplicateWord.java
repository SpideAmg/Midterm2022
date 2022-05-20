package string.problems;

import java.util.*;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String string = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        DuplicateWord duplicateWord = new DuplicateWord();
        duplicateWord.duplicateCheck(string);



    }

    public void duplicateCheck(String st) {

        String[] splittedData = st.split(" ");
        System.out.println("There are " + splittedData.length + " word in this sentence");

        HashMap<String, Integer> occurences = new HashMap<>();

        for (int i = 0; i < splittedData.length; i++) {
            Integer previousCount = occurences.get(splittedData[i]);
            if (previousCount == null) {
                previousCount = 0;
            }
            occurences.put(splittedData[i], previousCount + 1);
        }
        System.out.println(occurences);


    }

}