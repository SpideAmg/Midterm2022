package string.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String anag1;
        String anag2;
        Scanner sc = new Scanner(System.in);


        System.out.println(" Please enter the first string ");
        anag1 = sc.next();
        System.out.println(" Please enter the second string ");
        anag2 = sc.next();

        if (isAnagram(anag1, anag2)) {
            System.out.println(anag1 + " and " +  anag2 + " are Anagram");
        } else
            System.out.println(anag1 + " and " + anag2 + " are  not Anagram");

        sc.close();


    }
    public static boolean isAnagram(String anag1, String anag2) {

        if (anag1.length() != anag2.length()) {
            return false;
        }

        char[] array1 = anag1.toCharArray();
        char[] array2 = anag2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1,array2);
    }

}

