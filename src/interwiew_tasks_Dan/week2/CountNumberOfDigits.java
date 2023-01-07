package interwiew_tasks_Dan.week2;

import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {

countDigits();//Run



    }

    public static void countDigits(){
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num= input.nextInt();
        int count=0;
        for (char each : ("" + num).toCharArray()) {
            count++;
        }
        if (num>=0){
            System.out.println("The number of digits in is: "+count);
        }else{
            System.out.println("The number of digits is:  "+(count-1));
        }
    }
}
