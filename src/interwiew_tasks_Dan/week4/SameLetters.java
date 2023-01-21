package interwiew_tasks_Dan.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SameLetters {
    public static void main(String[] args) {
        System.out.println(hasSameLetters("Dan Spicica", "spicica dan"));
    }
    public static boolean hasSameLetters(String s1, String s2){
        boolean result=false;
        List<String> s1List=new ArrayList<>(Arrays.asList(s1.toLowerCase().split("")));
        Collections.sort(s1List);
        List<String>s2List= new ArrayList<>(Arrays.asList(s2.toLowerCase().split("")));
        Collections.sort(s2List);

        if (s1List.equals(s2List)){
            result=true;
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