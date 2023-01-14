package interview_tasks_week2_Mahdi;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(primeOrNot(200));
        System.out.println(primeOrNot(40));
        System.out.println(primeOrNot(-70));

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