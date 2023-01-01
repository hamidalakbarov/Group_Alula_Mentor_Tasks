package interview_tasks_Sohaila.week01;

public class SwapNumbers {

    //Numbers -- Swap Numbers
    //Swap two variable' values

    public static void main(String[] args) {
        swapNumbers(7, 10);
        swapNumbers(12, 200);
        swapNumbers1(160, 20);
    }

    public static void swapNumbers(int n1, int n2) {
        //Without temp Variable
        System.out.println("Before swapping: n1 = " + n1 + ", n2= " + n2);

        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("After swapping: n1 = " + n1 + ", n2= " + n2);
    }

    public static void swapNumbers1(int n1, int n2) {

        //With temp variable
        System.out.println("Before swapping: n1 = " + n1 + ", n2= " + n2);
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After swapping: n1 = " + n1 + ", n2= " + n2);
    }
}
