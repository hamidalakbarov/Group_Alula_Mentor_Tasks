package interview_task_Alex.week04;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    // 1-solution with the loop
    public static String removeDup1(String str){
        String result ="";
        for (int i = 0; i < str.length(); i++) {  // the simpliest way is to run the loop and collect a new string using !contains() method
            if (!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }
        }
        return result;
    }

    // 2-solution with streams
    public static String removeDup2(String str){
        String result ="";
        result = Arrays.asList(str.split("")).stream().distinct().collect(Collectors.joining()); // streams distinct method can remove duplicates
        return result;
    }

    // 3-solution with LinkedHashSet
    public static String removeDup3(String str){
        String result ="";
        LinkedHashSet<String> strList = new LinkedHashSet<>(Arrays.asList(str.split(""))); // linkedHashSet will implicitly remove duplicates
        for (String each : strList) { // so the only thing we need to do is to collect the elements back to a string
            result+=each;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDup1("AAABBBCCC"));
        System.out.println(removeDup2("AAABBBCCC"));
        System.out.println(removeDup3("AAABBBCCC"));
    }
}
