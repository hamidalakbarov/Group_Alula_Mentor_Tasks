package interview_tasks_week2_eva;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(Reverse("ABCD"));
        System.out.println(Reverse("Alula"));

    }

    public static String Reverse(String str){
        String result = "";
        for(int i= str.length()-1; i>=0 ; i--){
            result+=""+str.charAt(i);
        }
        return result;
    }


}
/*Reverse a string
Write a return method that can reverse String Ex: Reverse("ABCD");
==> DCBA*/