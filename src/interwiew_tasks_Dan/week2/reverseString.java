package interwiew_tasks_Dan.week2;

public class reverseString {
    public static void main(String[] args) {
        System.out.println(reverseAString("Dan"));
    }

    public static String reverseAString(String str){
        String reversed="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);

        }
        return reversed;
    }
}
/*
 Reverse a string
   Write a return method that can reverse String Ex: Reverse("ABCD"); ==> DCBA
 */