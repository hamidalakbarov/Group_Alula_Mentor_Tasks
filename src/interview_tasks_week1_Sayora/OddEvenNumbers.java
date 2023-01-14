package interview_tasks_week1_Sayora;

public class OddEvenNumbers {

    public void identify(int num){
        if(num % 2 == 0){ // dividing by 2 and remaining 0 is even
            System.out.println("Even number " + num);
        }else{
            System.out.println("Odd number " + num);
        }

    }

    public static void main(String[] args) {

        OddEvenNumbers num = new OddEvenNumbers(); // creating object
        num.identify(5);
        num.identify(6);
    }






}
/*
Numbers -- odd & even
Write a method which can identifies given number is
even or odd
EX:
identify(5) -> "Odd"
identify(6) -> "Even"
 */