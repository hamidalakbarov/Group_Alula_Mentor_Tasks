package interview_task_Alex.week01;

public class FINRA {

    public static void FINRA() {
        for (int i = 10; i < 31; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
                continue;
            } else if (i % 3 == 0) {
                System.out.println("FIN");
                continue;
            } else if (i % 5 == 0) {
                System.out.println("RA");
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        FINRA();
    }
}
