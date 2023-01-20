package interview_tasks_week4_hamid;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class SameLetters {

    public static void main(String[] args) {

        // Solution 2 - by using BePredicate Functional Interface with lambda expression
        BiPredicate<String, String> sameChars = (p1, p2) -> {
            Object[] sorted1 = Arrays.stream(p1.split("")).sorted().toArray();
            Object[] sorted2 = Arrays.stream(p2.split("")).sorted().toArray();
            return Arrays.equals(sorted1, sorted2);
        };
        System.out.println(sameChars.test("BCA", "ABC"));
    }

    public static boolean sameLetters(String str1, String str2) {

        // Solution 1 - by using 2 arrays and sort method
        char[] str1Chars = str1.toCharArray();
        char[] str2Chars = str2.toCharArray();

        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);

        return Arrays.equals(str1Chars,str2Chars);
    }
}
/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */