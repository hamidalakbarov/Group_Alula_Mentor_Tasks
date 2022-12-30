package interview_tasks_week1_eva;

public class SwapTwoVariables2 {

    public static void main(String[] args) {
        int x = 10,
                y = 15;
        x = x+y; //x=25
        y = x-y; //y=10
        x = x-y; //x=15
        System.out.println("x = " + x);
        System.out.println("y = " + y);



    }
}
