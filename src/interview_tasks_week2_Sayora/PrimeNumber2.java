package interview_tasks_week2_Sayora;

import java.util.ArrayList;

public class PrimeNumber2 {

    public static void main(String[] args) {

        System.out.println(findPrime(1, 100));

    }

    public static ArrayList<Integer> findPrime(int start, int end) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int n = start; n < end ; n++) {

            boolean prime = true;

            int i = 2; // declaring i
            while (i <= n / 2) { // will have remainder will be true
                if (n % i == 0) { // if number / by 2 or 3.. and do not have remainder it will be false
                    prime = false;
                    break;
                }
                i++; // i will be increase
            }
            if(prime){ // if it is prime
                primes.add(n); // add to arrayList
            }
        }

        return primes; //return arrayList
    }
}
