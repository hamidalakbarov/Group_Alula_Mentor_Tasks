package interview_tasks_week1_Latifa;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 978061;
        String result = oddOrEven(number);//calling the method
        System.out.println("result = " + result + ": " + number);

    }

   /* public static String oddOrEven(int number) {// first solution >> Nested if
        String result = (number > 0)?//nested if
                (number % 2 == 0)?
                "It is an even number":
                ("It is an odd number"):
                "Number is zero or less than zero";
        return result;
    }*/


    public static String oddOrEven(int number) {// second solution >> if and else
        String result = "";
        if (number > 0) {
            if (number % 2 == 0) {
                result = "It is an even number";
            } else
                result = "It is an odd number";
        } else {
            result = "Number is zero or less than zero";
        }
        return result;
    }
}
