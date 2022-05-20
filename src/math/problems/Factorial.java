package math.problems;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        N();
    }

    public static int N() {
        Scanner Nm = new Scanner(System.in);
        System.out.println("enter any number for his Factorial");
        int n;
        n = Nm.nextInt();
        //int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i; // *=
            System.out.println(fact);

        }
        return fact;
    }
}

