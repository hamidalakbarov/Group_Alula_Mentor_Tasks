package interview_tasks_week3_eva;

public class ReverseNegNumber {

    public static void main(String[] args) {

        int a = -1005;
        System.out.println(reverseNum(a));

    }

    public static int reverseNum(int  num) {
        String str = new StringBuilder(""+num).reverse().toString();
        if(num < 0) {
            str = "-"+str.substring(0, str.length()-1);
        }
        return Integer.valueOf(str);
    }
}
