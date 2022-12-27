public class FINRA {

    public static void main(String[] args) {

        FINRA.printFINRA(30);

    }

    public static void printFINRA(int number) {

        for (int i = 1; i <= number; i++) { // loop for iterating through numbers
            String result = "";

            // Solution 1 - with multiple single if statements
            /*if (i % 3 == 0) { // if divisible by 3
                result += "FIN";
            }
            if (i % 5 == 0) { // if divisible by 5
                result += "RA";
            }
            if (!result.isEmpty()) { // if result1 contains text to print
                System.out.println(result);
            }*/

            //--------------------------------------------------------------------

            // Solution 2 - ternary statement (shorthand if statement)
            result = (i % 3 == 0) ? "FIN" : (i % 5 == 0) ? "RA" : (i % 3 == 0 && i % 5 == 0) ? "FINRA" : "";

            if (!result.isEmpty()) { // if result1 contains text to print
                System.out.println(result);
            }
        }
    }
}
/*
Numbers -- FINRA
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA"
instead of the number, for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */