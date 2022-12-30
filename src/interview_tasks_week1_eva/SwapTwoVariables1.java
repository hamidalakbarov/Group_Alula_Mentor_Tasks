package interview_tasks_week1_eva;

public class SwapTwoVariables1 {

    public static void main(String[] args) {
        int x = 10, y = 15;
        int z = x; // temporary variable
        x=y; //x=15
        y=z; //y=z=old x

        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}
