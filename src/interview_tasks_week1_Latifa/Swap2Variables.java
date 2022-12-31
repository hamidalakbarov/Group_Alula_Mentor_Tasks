package interview_tasks_week1_Latifa;

public class Swap2Variables {

    public static void main(String[] args) {

        int n1 = 50;
        int n2 = 100;

        System.out.println("n1 before swap: " + n1);
        System.out.println("n2 before swap: " + n2);
        swap(n1, n2);

    }

    public static void swap(int n1, int n2) {
        int temporary = 0;
        temporary = n1;
        n1 = n2;
        n2 = temporary;
        System.out.println("n1 after swap = " + n1);
        System.out.println("n2 after swap = " + n2);
    }
}
