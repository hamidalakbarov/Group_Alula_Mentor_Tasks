package interview_tasks_week2_Lina;

public class NumberOfDigits {

    //1. Write a java program to count number of digits in a number

    public static void main(String[] args) {

        System.out.println(numberOfDigits(25598769));   //  8


    }

    public static int numberOfDigits(int num){

        String str = String.valueOf(num);

        String[] nums = str.split("");

        return nums.length;
    }
}
