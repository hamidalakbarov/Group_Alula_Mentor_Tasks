package interview_tasks_week2_Sayora;

public class Reverse {

    public static void main(String[] args) {

        //call the method
        System.out.println(reverse("ABCD")); // DCBA
    }
    
    public static String reverse(String word){

        String reverse= ""; // will reverse word to string

        for (int i = word.length() - 1; i >=0 ; i--) { // will count from last character
            reverse += word.charAt(i); // word character will add into reverse
        }
        return reverse; // will return revers
    }
}
/*
Reverse a string
Write a return method that can reverse String Ex: Reverse("ABCD");
==> DCBA
 */