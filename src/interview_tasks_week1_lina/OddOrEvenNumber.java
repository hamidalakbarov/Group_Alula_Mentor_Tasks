package interview_tasks_week1_lina;

public class OddOrEvenNumber {

     /*
    Numbers -- odd & even
        Write a method which can identifies given number is
        even or odd
    EX:
        identify(5) -> "Odd"
        identify(6) -> "Even"

     */


    public static void oddOrEven(int num){

        if (num %2 == 0){
            System.out.println("The number is even: " + num);
        }else{
            System.out.println("The number is odd: " + num);
        }
    }

    public static void main(String[] args) {

        oddOrEven(4);
        oddOrEven(5);

    }

}
