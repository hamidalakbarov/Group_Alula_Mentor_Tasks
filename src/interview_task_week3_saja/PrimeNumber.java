package interview_task_week3_saja;

public class PrimeNumber {

    public static boolean PrimeNumber( int num){ //creat a method(int)
        boolean result = false;

        if(num <= 1){
            return result;
        }

        for (int i = 2; i < num; i++) {
            if( num % i == 0){
                return false;
            }
        }
        return result;
    }

    public static void main(String args[])
    {
        if (PrimeNumber(-22))
            System.out.println(" true");
        else
            System.out.println(" false");
        if (PrimeNumber(15))
            System.out.println(" true");
        else
            System.out.println(" false");
    }
}
/*
Write a method that can check if a number is
prime or not
 */