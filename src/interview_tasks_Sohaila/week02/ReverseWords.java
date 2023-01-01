package interview_tasks_Sohaila.week02;

public class ReverseWords {
    //Write a return method that can reverse String Ex: Reverse("ABCD");==> DCBA

    public static void main(String[] args) {

        System.out.println(reverse("laptop"));
    }
    public static String reverse(String word) {

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        return reverse;
    }
}
