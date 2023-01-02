package interview_tasks_week1_Sayora;

import java.util.Scanner;

public class SecondOddEvenNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();

        if(number %2 ==0){
            System.out.println("Event number " + number);
        }else{
            System.out.println("Odd number " + number);
        }



    }
}
