package interview_tasks_week1_lina;

public class SwapNumbers {

     /*  Numbers -- Swap Numbers
    Swap two variable' values
*/

    public static void main(String[] args) {

        int a = 2;
        int b = 5;

        int c = a+b;

        b = a;
        a = c-b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
