package interview_tasks_week2_Mahdi;

public class CountNumber {
    public static void main(String[] args) {
        countNumber(894037);//number of digits = 6
    }

    public static void countNumber(int num) {
        String toString = "" + num;
        System.out.println("numbers of digits in " + num + " is: " + toString.length());
    }
}