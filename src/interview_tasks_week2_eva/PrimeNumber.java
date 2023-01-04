package interview_tasks_week2_eva;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println(PrimeNumber(10));
        System.out.println(PrimeNumber(7));
        System.out.println(PrimeNumber(41));

    }


    public static boolean PrimeNumber(int num){ //an int num > 1 ==> that cannot be exactly divided by any int number other than itself and 1 (e.g. 2, 3, 5, 7, 11).
        if(num<=1){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                return false;
            }

        }

    return true;

    }
}
