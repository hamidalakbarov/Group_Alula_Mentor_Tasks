package interview_tasks_week4_eva;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "AAABBCDD";
        System.out.println(frequencyOfChars(str));


    }

    public static String frequencyOfChars(String str){

        String result="";
        for (int i = 0; i < str.length(); i++) {// getting every single character from str
            char ch = str.charAt(i);//store it into ch

            int count = 0;
            for (int j = 0; j < str.length(); j++) {//getting every single character for counting purpose
                if(str.charAt(j)== ch){//if the character is matching with next one
                    count++;//increase the count
                }
            }
            if(result.contains(""+ch)){//after iteration if result already contains the character we will continue/skip
                continue;
            }
            result+= ""+ch+count;
        }


        return result;
    }


}
/*String -- Frequency of Characters
 Write a return method that can find the frequency of
 characters
 Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/