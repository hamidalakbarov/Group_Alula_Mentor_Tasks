package interview_task_Alex.week01;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);

        // swapping the numbers:
        number1=number1+number2;
        number2=number1-number2;
        number1=number1-number2;

        System.out.println("Result after swapping: ");
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);

    }
}
