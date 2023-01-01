package interview_tasks_Sohaila.week02;

public class PrimeNumbers {

    //Write a java program to find if a number is Prime number

    public static void main(String[] args) {

        System.out.println(primeOrNot(100));
        System.out.println(primeOrNot(11));
        System.out.println(primeOrNot(-20));
    }

    public static boolean primeOrNot(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
