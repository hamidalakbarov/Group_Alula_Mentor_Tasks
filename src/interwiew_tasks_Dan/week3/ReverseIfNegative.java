package interwiew_tasks_Dan.week3;

public class ReverseIfNegative {
    public static void main(String[] args) {
        System.out.println(reverseIfNegative(-201));
    }

    public static int reverseIfNegative(int num){

        String reversed="-",snum=""+num;
        if(num>=0){
            return num;
        }else{

            for (int i = snum.length()-1; i >=1 ; i--) {
                reversed+=snum.charAt(i);


            }


        }

        return Integer.parseInt(reversed);
    }

}
