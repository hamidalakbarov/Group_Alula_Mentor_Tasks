package interwiew_tasks_Dan.week2;


import java.util.Scanner;

public class ReverseTheString {
    public static void main(String[] args) {
        reverseString();

    }

    public static void reverseString(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your text: ");
        String text= input.nextLine();
        String reversedString="";
        for (int i = text.length()-1; i >=0 ; i--) {
            reversedString+=text.charAt(i);

        }
        System.out.println(reversedString);
    }

}
