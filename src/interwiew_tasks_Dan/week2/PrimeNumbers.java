package interwiew_tasks_Dan.week2;

public class PrimeNumbers {
    public static void main(String[] args) {
        primeOrNot(21);

    }

    public static void primeOrNot(int num) {
        if (num <= 1) {
            System.out.println(num + " is not a prime number");
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {

                System.out.println(num + " is not a prime number");

            } else {
                System.out.println(num + " is prime number");
                break;
            }
        }
    }
}

/*
//Write a java program to find if a number is Prime number
 */