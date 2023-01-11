package interview_task_Alex.week02;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        /*Write a java program to find if a number is Prime number*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number below:");
        int number = scan.nextInt();

        String result="The number is prime";

        for (int i = 2; i < number; i++) {
            if (number%i==0){
                result = "Not a prime number";
                break;
            }
        }

        System.out.println(result);

    }
}
