package interview_tasks_Sohaila.week01;

public class OddEvenNumbers {
    /* Numbers -- odd & even
    Write a method which can identifies given number is even or odd
    EX:
    identify(5) -> "Odd"
    identify(6) -> "Even"
     */

    public static void main(String[] args) {

        System.out.println(identifyOddEven(5));
        System.out.println(identifyOddEven(6));
        System.out.println(identifyOddEven(0));

    }
    public static String identifyOddEven(int num) {
        if (num % 2 == 0) {
            return num + ": Even";
        }
        return num + ": Odd";
    }
}
