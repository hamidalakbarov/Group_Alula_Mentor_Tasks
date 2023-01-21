package interview_tasks_week4_eva;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "AAABBBCCC";
        System.out.println(removeDup(str));

        String s = "aabbcddd";
        System.out.println(removeDuplicates(s));
    }

    //first method
    public static String removeDup(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!result.contains(""+ch)){
                result+= ch;
            }

        }


        return result;
    }

    //second method
    public static String removeDuplicates(String str){
        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        return str.replace("[","").replace("]","").replace(",","");

    }
}
/*String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC*/