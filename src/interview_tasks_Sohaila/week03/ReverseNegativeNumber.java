package interview_tasks_Sohaila.week03;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        System.out.println(reverseNegNumber(-9850));
        System.out.println(reverseNegNumber(1200));
    }

    public static int reverseNegNumber(int number) {

        if (number >= 0) {
            return number;
        }

        String result = "" + number;
        String reverse = "" + result.charAt(0);

        for (int i = result.length() - 1; i >= 1; i--) {
            reverse += result.charAt(i);
        }
        return Integer.parseInt(reverse);
    }
}
