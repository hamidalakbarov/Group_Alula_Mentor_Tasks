package interview_tasks_latifa.week4;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String result = frequencyOfChar("AABB##GGAAT");
        System.out.println("result = " + result);

    }


    // first solution using String methods

    /*public static String frequencyOfCharacters(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }
            if (result.contains("" + str.charAt(i))) {
                continue;
            }
            result += str.charAt(i) + "" + frequency;
        }

        return result;
    }*/

    // second solution using array
    public static String frequencyOfChar(String str){
        String[] arr = str.split("");
        String result = "";

        for (String each : arr) {
            int frequency =0;
            for (String each1 : arr) {
                if( each.equals(each1)){
                    frequency++;
                }
            }
            if( result.contains(each)){
                continue;
            }
            result += each +"" +frequency;
        }
        return result;
    }
}
