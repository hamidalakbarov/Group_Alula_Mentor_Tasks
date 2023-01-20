package interview_task_Alex.week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SameLetters {

    // solution with streams
    public static boolean same1(String str1, String str2){
        boolean isSameLetters = false;
        if (Arrays.asList(str1.toLowerCase().split("")).stream().sorted().collect(Collectors.toList()).equals(Arrays.asList(str2.toLowerCase().split("")).stream().sorted().collect(Collectors.toList()))){
            isSameLetters = true;
        }
        return isSameLetters;
    }

    // solution with Collections.sort();
    public static boolean same2(String str1, String str2){
        boolean isSameLetters = false;
        // turn str1 into a list and sort it with Collections.sort()
        List<String> str1Sorted = new ArrayList<>(Arrays.asList(str1.toLowerCase().split("")));
        Collections.sort(str1Sorted);

        // turn str2 into a list and sort it with Collections.sort()
        List<String> str2Sorted = new ArrayList<>(Arrays.asList(str2.toLowerCase().split("")));
        Collections.sort(str2Sorted);

        if (str1Sorted.equals(str2Sorted)){
            isSameLetters = true;
        }
        return isSameLetters;
    }

    public static void main(String[] args) {
        System.out.println(same1("abc", "cab"));
        System.out.println(same1("avc", "cab"));
        System.out.println("-------------------------------");
        System.out.println(same2("abc", "cab"));
        System.out.println(same2("avc", "cab"));

    }
}
