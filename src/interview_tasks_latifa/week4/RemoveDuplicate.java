package interview_tasks_latifa.week4;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args) {

        String result = removeDuplicate("dfgghsjj");
        System.out.println("result = " + result);

        String str = "jhhhkkkhaaaaeertgfkf";
        String[] arr = str.split("");

        str =  Arrays.stream(arr).distinct().collect(Collectors.joining());// using stream function
        System.out.println("str = " + str);


        //System.out.println(Arrays.toString(Arrays.stream(arr).distinct().toArray() ) );// using stream()
        //List<String> list = new ArrayList<>(Arrays.asList(arr));
        //list =  list.stream().distinct().collect(Collectors.toList());
        //System.out.println(list);

    }

    public static String removeDuplicate(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int frequency =0;
            for (int j = 0; j < str.length(); j++) {
                char ch1 = str.charAt(j);
                if( ch == ch1 ){
                    frequency ++;
                }
            }
            if( frequency == 1 ){
                result += ch;
            }

        }
        return result;
    }
}
