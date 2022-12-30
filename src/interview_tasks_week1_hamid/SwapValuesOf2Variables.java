package interview_tasks_week1_hamid;

public class SwapValuesOf2Variables {

    public static void main(String[] args) {

        // Before swapping
        int a = 123;
        int b = 321;
        System.out.println("Before swapping \na=" + a + "\nb=" + b);

        System.out.println("------------------------------------");

        // Solution 1
        a += b; // a = (123 + 321 = 444)
        b = a - b; // b = (444 - 321 = 123)
        a -= b; // a = (444 - 123 = 321)

        System.out.println("After swapping \na=" + a + "\nb=" + b); // a = 321, b = 123

        System.out.println("------------------------------------");

        // Solution 2
        a *= b; // a = (321 * 123 = 39483)
        b = a / b; // b = (39483 / 123 = 321)
        a /= b; // a = (39483 / 321 = 123)

        System.out.println("Another swapping \na=" + a + "\nb=" + b); // a = 123 b = 321

    }
}
/*
Numbers -- Swap Numbers Swap two variable' values
 */
