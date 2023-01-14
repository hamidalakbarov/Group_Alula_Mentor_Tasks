package interview_tasks_week1_Mahdi;

public class FINRA {
    public static void main(String[] args) {

        int num = 20;
        if (num >= 1 && num <= 30) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FINRA");
            } else if (num % 3 == 0) {
                System.out.println("FIN");
            } else if (num % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(num);
            }
        }

    }
}