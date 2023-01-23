package interwiew_tasks_Dan.week2;

public class CountNumOfDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(120));
    }
    public static int countDigits(int num){
        int count =0;
        String snum=""+num;
        for (char each : snum.toCharArray()) {
            count++;

        }
        if (num<0){
            return count-1;
        }else {
            return count;
        }

    }
}
