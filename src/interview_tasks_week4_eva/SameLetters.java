package interview_tasks_week4_eva;

import java.util.Arrays;
import java.util.TreeSet;

public class SameLetters {

    public static void main(String[] args) {
        String str = "abc", str1 = "abb";
        System.out.println(sameLetters(str,str1));

        String s = "abc", s1 = "cab";
        System.out.println(ifSameLetters(s,s1));
    }

    //first method
    public static boolean sameLetters(String str, String str1){

        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch1);

        String s = "";
        String s1= "";

        for (char each : ch) {
            s+=each;
        }
        for (char each : ch1) {
            s1+=each;
        }
        return s.equals(s1);
    }

    //second method
    public static boolean ifSameLetters(String str, String str1){
        str = new TreeSet<String>(Arrays.asList(str.split(""))).toString();
        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();

        return str.equals(str1);
    }
}
/*String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:*/