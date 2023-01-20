package interview_tasks_week4_hamid;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAHHBB"));
    }

    public static String removeDuplicates(String str) {
        String result = "";

        // Solution 1 - by using loop and string
        /*for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.charAt(i)+"")) {
                result += str.charAt(i);
            }
        }*/

        // Solution 2 - by using collections
       /* Set<String> uniques = new LinkedHashSet<>(Arrays.asList(str.split("")));
        for (String each : uniques) {
            result += each;
        }*/

        // Solution 3 - by using stream
        return Arrays.stream(str.split("")).distinct().reduce("", (a, b) -> a + b);
    }
}
/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */