package interwiew_tasks_Dan.week4;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(noDuplicates("asdasdasd"));
        System.out.println(noDuplicates2("asdasdasd"));
    }

    // imperative approach
    static public String noDuplicates(String s){
        String result="";
        for (int i = 0; i < s.length(); i++) {
            if (!result.contains(""+s.charAt(i))){
                result+=s.charAt(i);
            }

        }

        return result;

    }
    //declarative approach
    public static String noDuplicates2(String s){
        String result= Arrays.asList(s.split("")).stream().distinct().collect(Collectors.toList()).toString();
        return result.replace("]","").replace("[","").replace(", ","");
    }

}




/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC

*/