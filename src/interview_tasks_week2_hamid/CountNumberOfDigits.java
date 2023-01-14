package interview_tasks_week2_hamid;

public class CountNumberOfDigits {

    public static void main(String[] args) {

        // Solution 1 - by using while loop to divide number until reaching 0
        int number = 78596, numberForPrint = number, countDigits = 0;

        while (number > 0) {
            number /= 10;
            countDigits++;
        }

        System.out.println("Number of digits in " + numberForPrint + " is " + countDigits);

        // Solution 2 - by converting number to String
        int number1 = 456321, countDigits1 = 0;

        for (char eachDigit : ("" + number1).toCharArray()) {
            countDigits1++;
        }

        System.out.println("Number of digits is " + countDigits1);
    }
}
/*
1. Write a java program to count number of digits in a number
 */