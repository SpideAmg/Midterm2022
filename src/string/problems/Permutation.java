package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permutation("", "DOG");
    }

    public static void permutation(String string, String permutation) {

        int l = permutation.length();
        if(l == 0){
            System.out.println(string);
        }else{
            for(int i = 0; i < l; i++){

                permutation(string + permutation.charAt(i), permutation.substring(0,i) + permutation.substring(i+ 1, l));
            }
        }

    }
    }

