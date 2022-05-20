package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        String[] srt = s.split(" ");
        String wordLarge="";
        for(int i = 0 ; i < srt.length; i++){
            if(srt[i].length() > wordLarge.length()){
                wordLarge  = srt [i];
            }
        }
        System.out.println(wordLarge.length()+ " " +wordLarge);

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement

        return map;
    }
}
