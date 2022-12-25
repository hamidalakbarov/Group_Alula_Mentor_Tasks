import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        // Creating scanner for getting inputs from user
        Scanner input = new Scanner(System.in); // Will get an input from keyboard

        System.out.println("Please enter number");
        int number = input.nextInt();

        // Solution 1
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else if (number % 2 != 2) {
            System.out.println(number + " is an odd number");
        } else {
            System.out.println(number + " is nether even nor odd");
        }
    }
}
/*
Numbers -- odd & even
Write a method which can identifies given number is even or odd
EX:
identify(5) -> "Odd" identify(6) -> "Even"
 */