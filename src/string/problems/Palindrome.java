package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }
        if (str.equals(reverse)) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String str;
        Scanner sc = new Scanner(System.in);


        System.out.println("enter a string");
        str = sc.next();
        if (isPalindrome(str)) {
            System.out.println(str + " " + "is a Palindrome");
        } else {
            System.out.println(str + " " + "is not  a Palindrome");

        }
        sc.close();
    }
}
