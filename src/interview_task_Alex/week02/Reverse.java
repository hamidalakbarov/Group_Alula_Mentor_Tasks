package interview_task_Alex.week02;

public class Reverse {

    /*Reverse a string
Write a return method that can reverse String Ex: Reverse("ABCD");
==> DCBA*/

    public static String reverse(String str){
        String reversedString ="";
        for (int r = str.length()-1; r >= 0; r--) {
           reversedString+=str.charAt(r);
        }
        return reversedString;
    }

    public static void main(String[] args) {
        System.out.println(reverse("ABCD"));
    }
}
