package interview_tasks_week2_latifa;

public class CountDigits {

    public static void main(String[] args) {

        countNumber(77703);//number of digits = 5
    }

    public static void countNumber(int num) {
        String toString = "" + num;
        System.out.println("numbers of digit in " + num + " is: " + toString.length());
    }
}
