package interview_tasks_week2_Sayora;

public class CountNumber {

    public static void main(String[] args) {

        int count =0;
        int num = 123456;

        while(num !=0){
            num /= 10; // num = num / 10
            count ++;
        }
        System.out.println("Number of digits " + count);

    }

}
/*
Write a java program to count number of digits in a number
 */