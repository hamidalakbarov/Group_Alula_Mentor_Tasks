package interview_tasks_week3_eva;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        int a = reverseNegNumber(-654);
        System.out.println(a);
        int b = reverseNum(-123);
        System.out.println(b);

    }

    public static int reverseNegNumber(int num){

        if(num<0){
            num*= -1;
        }else{
            System.err.println("The number is not negative");
            return num;
            }

        String str =""+ num;
        String reverseNum = "";

        for(int i= str.length()-1; i>=0;i--){
           reverseNum+= str.charAt(i);
        }
        str = "-"+reverseNum;

        return Integer.valueOf(str);
    }



    public static int reverseNum(int n){
        boolean isNegative = (n<0)? true:false;
        if(isNegative){
            n *= -1;//123
        }

        int reverse = 0;
        int lastNum = 0;

        while(n>=1){
            lastNum = n%10;//3,2,1
            reverse = reverse*10 + lastNum;//321
            n = n/10;//12,1
        }
        if(isNegative == true){
            return reverse* (-1);
        }else{
            return reverse;
        }
    }

}

