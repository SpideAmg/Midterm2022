package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int num = 40;
        int fibo = -1;
        int s = 1;

        // System.out.println(f);
        // System.out.println(s);
        for (int i = 1; i <= num; i++) {
            int r = fibo + s;
            //  System.out.println(t);
            fibo = s;
            s = r;
            System.out.println(r);
        }
    }
}

