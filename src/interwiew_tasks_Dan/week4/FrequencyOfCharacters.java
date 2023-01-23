package interwiew_tasks_Dan.week4;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("asdasdasd"));
    }

    public static String frequencyOfCharacters(String s){
        String result="";

        for (int i = 0; i < s.length(); i++) {
            char ch= s.charAt(i);
            int count =0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j)==ch){
                    count++;

                }

            }
            if (result.contains(""+ch)){
                continue;
            }
            result+=ch+""+count;
        }
        return result;
    }
}
/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */