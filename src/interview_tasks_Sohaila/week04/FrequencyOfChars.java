package interview_tasks_Sohaila.week04;

import java.util.Arrays;

public class FrequencyOfChars {

    /** String -- Frequency of Characters
     Write a return method that can find the frequency of characters
     Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2**/
    public static String countFreqOfChars(String str){

        int freq;
        String result = "";

        for (char ch1 : str.toCharArray()) {
            freq = 0;
            for (char ch2 : str.toCharArray()) {
                if (ch1 == ch2){
                    freq++;
                }
            }
            if (!result.contains(ch1+"")){
                result += "" +ch1 + freq;
            }
        }
       return result;
    }

    public static String countFreqOfChars2(String str){

        String [] arr = str.split("");

        String result = "";

        for (String each : arr) {

            if (!result.contains(each)) {
                result += each + Arrays.stream(arr).filter(a -> a.equals(each)).count();
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(countFreqOfChars("AAABBCDD"));
        System.out.println(countFreqOfChars2("AAABBCDD"));

    }
}




