package interwiew_tasks_Dan.week2;
/*
. Reverse a string
Write a return method that can reverse String Ex: Reverse("ABCD");
==> DCBA
 */

import java.util.Scanner;

public class ReverseTheString {
    public static void main(String[] args) {
        System.out.println(reverseString());

    }

    public static String reverseString(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your text: ");
        String text= input.nextLine();
        String reversedString="";
        for (int i = text.length()-1; i >=0 ; i--) {
            reversedString+=text.charAt(i);

        }
        return reversedString;


    }

}