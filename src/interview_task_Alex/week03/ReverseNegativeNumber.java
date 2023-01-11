package interview_task_Alex.week03;

public class ReverseNegativeNumber {

    public static int reverceNegNum(int number){
        if (number>=0){
            System.err.println("The number is not negative!");
            return number;
        }

        String numberStr =""+number;
        String revNumStr ="-";

        for (int i = numberStr.length() - 1; i > 0 ; i--) {
            revNumStr+=numberStr.charAt(i);
        }

        int revNumber = Integer.parseInt(revNumStr);

       return revNumber;
    }

    public static void main(String[] args) {
        System.out.println(reverceNegNum(-123456));
    }
}
