package interview_tasks_week1_eva;

public class Numbers {
    public void identify(int number){
        if(number%2== 0){ //when we divide the num with 2, remaining has to be 0 for even number. we use modulus arithmetic operator
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    // second way

    /*String evenOrOdd = (number %2 == 0)? "even":"odd";
    System.out.println(number +" is "+evenOrOdd);*/

    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.identify(5);
        num.identify(6);
    }
}

/**Numbers -- odd & even
 Write a method which can identifies given number is
 even or odd
 EX:
 identify(5) -> "Odd"
 identify(6) -> "Even"*/

