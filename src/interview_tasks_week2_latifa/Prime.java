package interview_tasks_week2_latifa;

public class Prime {

    public static void main(String[] args) {

        prime(47);// is prime number
        prime(50);// is not prime number
    }

    public static void prime(int num) {
        int count = 0;
        if (num <= 1) {
            System.out.println(num + " is not prime number");
            return;
        }
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count > 2) {
            System.out.println(num + " is a not prime number.");
        } else {
            System.out.println(num + " is a prime number.");
        }

    }
}
