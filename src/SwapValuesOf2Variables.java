public class SwapValuesOf2Variables {

    public static void main(String[] args) {

        // Before swapping
        int a = 123;
        int b = 321;
        System.out.println("Before swapping \na=" + a + "\nb=" + b);

        System.out.println("------------------------------------");

        // Solution 1
        a += b; // a = 100 + 500 = 600
        b = a - b; // b = 600 - 500 = 100
        a -= b; // a = 600 - 100 = 500

        System.out.println("After swapping \na=" + a + "\nb=" + b); // a = 500 b = 100

        System.out.println("------------------------------------");

        // Solution 2
        a *= b; // a = 100 * 500 = 50,000
        b = a / b; // b = 50,000 / 500 = 100
        a /= b; // a = 50,000 / 100

        System.out.println("Another swapping \na=" + a + "\nb=" + b); // a = 100 b = 500

        System.out.println("------------------------------------");

        // Solution 3








    }
}
/*
Numbers -- Swap Numbers Swap two variable' values
 */