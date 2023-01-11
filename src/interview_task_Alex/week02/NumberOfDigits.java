package interview_task_Alex.week02;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {

        /* Write a java program to count number of digits in a number*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number below:");
        String number =""+ scan.nextInt();
        int count = 0;

        for (char each : number.toCharArray()) {
            if (each == '-'){
               continue;
            }
            count++;
        }

        System.out.println("The number of digits in the provided number is: "+count);

    }
}
