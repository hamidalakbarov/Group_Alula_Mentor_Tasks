package interview_tasks_week2_hamid;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));
    }

    public static String reverse(String word) {
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return reversed;
    }
}
/*
2. Reverse a string
   Write a return method that can reverse String Ex: Reverse("ABCD"); ==> DCBA

 */