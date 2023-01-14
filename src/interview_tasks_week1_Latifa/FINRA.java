package interview_tasks_week1_Latifa;

public class FINRA {

    public static void main(String[] args) {
        finra();
    }

    public static void finra() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
                continue;
            } else if (i % 5 == 0) {
                System.out.println("RA");
                continue;
            } else if (i % 3 == 0) {
                System.out.println("FIN");
                continue;
            }
            System.out.println(i);
        }
    }
}
