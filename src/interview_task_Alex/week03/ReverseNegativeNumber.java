package interview_task_Alex.week03;

public class ReverseNegativeNumber {

    public static int reverceNegNum(int number){
        if (number>=0){
            System.err.println("The number is not negative!");
            return number;
        }

        String revNumStr ="-";

        for (int i = ("" + number).toCharArray().length - 1; i > 0 ; i--) {
            revNumStr+=""+("" + number).toCharArray()[i];
        }

        int revNumber = Integer.parseInt(revNumStr);

       return revNumber;
    }

    public static void main(String[] args) {
        System.out.println(reverceNegNum(-123456));
    }
}
