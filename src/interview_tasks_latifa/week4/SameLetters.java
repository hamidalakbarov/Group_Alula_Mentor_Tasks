package interview_tasks_latifa.week4;

import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {
        String str = "abhcd";
        String str1 = "dabc";
        boolean result = sameLetters(str, str1);
        System.out.println("result = " + result);

    }

    public static boolean sameLetters(String str, String str2) {

        boolean result = false;
        String[] arr1 = str.split("");
        String[] arr2 = str2.split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (String each : arr1) {
            for (String each1 : arr2) {
                if (each.equalsIgnoreCase(each1)) {
                    result = true;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }
}
/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */

