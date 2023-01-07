package interwiew_tasks_Dan.week2;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println(checkIfPrime(11));
    }

    public static boolean checkIfPrime(int num){
        boolean isPrime=true;
        if (num<1) {
            isPrime = false;
        }else{
            int count=0;
            for (int i = 1; i <=num; i++) {
                if (num%i==0){
                    count++;
                }

                }
            if (count>2){
                isPrime=false;
            }else {
                isPrime = true;
            }
        }
        return isPrime;
    }
}
