package interview_tasks_week2_Lina;

public class ReverseString {

     /*
    2. Reverse a string
            Write a return method that can reverse String Ex: Reverse("ABCD");
            ==> DCBA
     */


    public static String reverseString(String str){

        char[] chars = str.toCharArray();
        String reversed = "";

        for (int i = chars.length-1; i >= 0; i--){
            reversed += chars[i];
        }
        return reversed;
    }

    //      or

    public static String revString(String str){

        String[] leters = str.split("");
        String reversed = "";

        for (int i = leters.length-1; i >= 0; i--){
            reversed += leters[i];
        }
        return reversed;
    }


    public static void main(String[] args) {

        System.out.println(reverseString("ABCD"));  //  DCBA
        System.out.println(revString("ABCD"));      //  DCBA

    }
}
