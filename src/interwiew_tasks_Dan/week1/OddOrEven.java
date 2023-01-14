package interwiew_tasks_Dan.week1;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(identify(8));

    }

    public static String identify(int num){
        String message="";
        if (num%2==0){
            System.out.println(num+" is an even number");
        }else{
            System.out.println(num+" is an odd number");
        }
        return message;
    }
}
