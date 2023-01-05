package interview_tasks_week2_Mahdi;

public class ReserveString {
    public static void main(String[] args) {
        String result = reverse("Python");
        System.out.println(result);//nohtyP
    }
    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

}
