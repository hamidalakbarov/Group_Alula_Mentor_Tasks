package interview_tasks_week4_hamid;

import java.util.Arrays;

public class FrequencyOfChars {

    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("AAABBBCDD"));
    }

    public static String frequencyOfCharacters(String str) {
        String result = "";

        // Solution 1 - by using nested loops
       /* for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char character = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (character == str.charAt(j)) {
                    count++;
                }
            }
            if (!result.contains("" + character)) {
                result += "" + character + count;
            }
        }*/

        // Solution 2 - by using array and Stream
        for (String each : str.split("")) {
            if (!result.contains(each)) {
                result += each + (Arrays.stream(str.split("")).filter(p -> p.equals(each)).count());
            }
        }
        return result;
    }
}
/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */