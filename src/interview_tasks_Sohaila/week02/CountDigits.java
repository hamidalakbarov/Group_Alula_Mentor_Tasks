package interview_tasks_Sohaila.week02;

public class CountDigits {
    // 1. Write a java program to count number of digits in a number

    public static void main(String[] args) {

        System.out.println(countDigits(12005));
        System.out.println(countDigits(300));
        System.out.println(countDigits(000300));

    }

    public static int countDigits(int num) {

        int count = 0;

        while (num !=0 ){
            num/=10;
            count++;
        }
        return count;
    }

    public static int countDigits1(int num) {

        String result = num+"";
        int count = 0;

        for (char each: result.toCharArray()){
            count++;
        }
        return count;
    }
}
