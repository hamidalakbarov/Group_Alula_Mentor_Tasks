package interview_task_Alex.week04;

public class FrequencyOfChars {
    public static String frequencyOfChars(String str){
    String result = "";
    int count;
        for (int i = 0; i < str.length(); i++) { // outer loop to grab every char from the string
            count = 0; // restart count variable for every iteration
            for (int j = 0; j < str.length(); j++) { // inner loop to compare current char to / count
                if (str.charAt(i) == str.charAt(j)){ // if match found -> count +1
                    count++;
                }
            }
            if (!result.contains(""+str.charAt(i))){ // if char wasn't counted yet -> add it to the result string
                result += ""+str.charAt(i) + count;
            }
        }
    return result;
    }

    public static void main(String[] args) {
        String str = "AAABBCDD";
        System.out.println(frequencyOfChars(str));
    }
}
