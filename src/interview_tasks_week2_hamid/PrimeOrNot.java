package interview_tasks_week2_hamid;

public class PrimeOrNot {

    public static void main(String[] args) {

        primeOrNot(5);
        primeOrNot(15);
        primeOrNot(155);

        System.out.println(returnPrimeOrNot(9));
    }


    // Solution 1 - with method that has void return type
    public static void primeOrNot(int number) {
        boolean isPrime = true;
        int divisor = 2;

        while (divisor < number) {
            if (number % divisor == 0) {
                isPrime = false;
                break;
            }
            divisor++;
        }
        System.out.println((isPrime) ? number + " is a prime number" : number + " is not a prime number");
    }

    // Solution 2 - with method that returns boolean value
    public static boolean returnPrimeOrNot(int number) {
        boolean isPrime = true;

        for (int i=2; i<number; i++) {
            if (number%i==0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
/*
3. Write a java program to find if a number is Prime number
 */