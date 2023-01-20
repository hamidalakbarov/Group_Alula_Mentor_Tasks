package interview_task_week3_saja;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("Enter the number ");

        int number =input.nextInt();


        System.out.println(number + " Negative number");   // display
        number = Math.abs(number);  //  Math Operator method is used to remove to postive
        System.out.println(number + " after conversation number");    // 10   (positive)
        // here we converted this negative number to postive 10
        //  -10  it will convert it to 10
        // now lets go ahead reverse the number

        System.out.println("Orignal Number :"  + number );
        int reversed=0;    // introduce a new varaible
        while (number !=0) { //  if number is not equals to zero than

            int digit = number % 10;    // this new Digit = number(10) % 10 = 1  .
            reversed = reversed * 10 + digit;  // 0 = 0 x 10 (+1 ) so we will multiply (*)
            //  10 * 0 = (0 +1 )  =  1

            // Remove last digit  from number

            number/=10;      //  1 /10  == 0.1  (we got the answer)

            System.out.print(reversed );  // 1
        }
        input.close();

    }

}
/*
Write a programe that converts negative to postive and that reverse the number
 */