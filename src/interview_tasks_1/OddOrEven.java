package interview_tasks_1;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        // Creating scanner object for getting inputs from user
        Scanner input = new Scanner(System.in); // Will get an input from keyboard

        System.out.println("Please enter number"); // printing message
        int number = input.nextInt(); // getting int type input and assigning it to the variable

        // Solution 1 - using branched if statement
        if (number % 2 == 0) { // if divisible by 2 with no remainder
            System.out.println(number + " is an even number");
        } else if (number % 2 != 2) { // if not divisible by 2 without remainder
            System.out.println(number + " is an odd number");
        } else {
            System.out.println(number + " is nether even nor odd");
        }

        // Solution 2 - using ternary statement
        String result = (number % 2 == 0) ? number + " is an even number" : (number % 2 != 2) ? number + " is an odd number"
                : number + " is nether even nor odd";
        System.out.println(result);

        // Solution 3 - using nested if
        if (number != 0) {
            boolean isEven = number % 2 == 0;
            if (isEven) {
                System.out.println(number + " is an even number");
            } else {
                System.out.println(number + " is an odd number");
            }
            return;
        }
        System.out.println(number + " is nether even nor odd");

        input.close();
    }
}
/*
Numbers -- odd & even
Write a method which can identifies given number is even or odd
EX:
identify(5) -> "Odd" identify(6) -> "Even"
 */