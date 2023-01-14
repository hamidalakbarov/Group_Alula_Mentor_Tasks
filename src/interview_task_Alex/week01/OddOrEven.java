package interview_task_Alex.week01;

import java.util.Scanner;

public class OddOrEven {

    /*Numbers -- odd & even
    Write a method which can identifies given number is
    even or odd
    EX:
    identify(5) -> "Odd"
    identify(6) -> "Even"*/

    public static void identify(int number){
        String result ="";
        if (number %2 == 0){
            result = "Even";
        }else {
            result = "Odd";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number below:");
        int number = scan.nextInt();
        identify(number);

    }












}
