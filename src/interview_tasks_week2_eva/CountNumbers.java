package interview_tasks_week2_eva;

public class CountNumbers {

    public static void main(String[] args) {

        System.out.println(countDigits(1005623));
        System.out.println(countDigits(254687));



    }

    public static int countDigits(int num){

        int count =0;
        while(num>0){
            num/=10;
            count++;
        }

        return count;
    }
}
