package interwiew_tasks_Dan.week1;

public class Swap2numbers {

    public static void main(String[] args) {
        numSwap(23,12);
    }

    public static void numSwap(int num1,int num2){


        num1=num1+num2;//15
        num2=num1-num2;//15-10=5
        num1=num1-num2;//10

        System.out.println("num1="+num1+"\nnum2="+num2);



    }
}
