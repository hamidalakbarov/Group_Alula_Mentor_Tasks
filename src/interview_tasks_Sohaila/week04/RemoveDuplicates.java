package interview_tasks_Sohaila.week04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    /**String -Remove Duplicates
     Write a return method that can remove the duplicated values from String
     Ex: removeDup ("AAABBBCCC")==> ABC*/

    public static String removeDup(String str) {

        String result = "";

        for (char each : str.toCharArray()) {
            if (!result.contains(each+"")){
                result += each;
            }
        }
        return result;
    }

    public static String removeDup2(String str) {

        Set<String> set = new HashSet<>(Arrays.asList(str.split("")));

        return String.join("", set);

        //return set.stream().collect(Collectors.joining());
    }

    public static void main(String[] args) {

        System.out.println(removeDup("AAABBBCCC"));
        System.out.println(removeDup2("AAABBBCCC"));
    }
}
