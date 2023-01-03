package interview_tasks_week2_Sayora;

public class PrimeNumber {
    public static void main(String[] args) {

        int number = 5;// number prime or not
        boolean prime = true;

        int i = 2;
        while (i <= number/2){ // if number is more than 2  and have remainder it will be prime
            if (number % i ==0) { // if number / by 2 or 3.. and fo not have remainder it will be false
                prime = false;
                break;
            }
            i++;
        }

        System.out.println(prime);
    }

}
/*
Write a java program to find if a number is Prime number
 */