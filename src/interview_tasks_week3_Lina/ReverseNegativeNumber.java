package interview_tasks_week3_Lina;

public class ReverseNegativeNumber {

    /*
       2. Numbers -- Reverse negative number
               Write a return method that can reverse
               negative number and return it as int
        */

    public static Integer reversedNum(int num) {   // -4569

        String number = String.valueOf(num);  // converted int into String

        String reversedNumber = "";

        if (num < 0) {  // reverse negative number
            //        0  1  2  3  4
            String[] nums = number.split("");  // create array of the number   {-, 4, 5, 6, 9}

            reversedNumber = "-";                   // add minus to the head os the reversed string

            for (int i = nums.length - 1; i > 0; i--) {
                reversedNumber += nums[i];        // add elements to string in the reversed order
            }
        } else {  // reverse positive number

            String[] nums = number.split("");  // create array of the number

            reversedNumber = "";
            //      0, 1 , 2, 3
            for (int i = nums.length - 1; i >= 0; i--) {     // {4, 5, 6, 7}
                reversedNumber += nums[i];        // add elements to string in the reversed order
            }
        }

        Integer reversedNum = Integer.valueOf(reversedNumber);  // convert string into integer value

        return reversedNum;

    }


    public static void main(String[] args) {

        System.out.println(reversedNum(2635));    // 5362
        System.out.println(reversedNum(-6232));   // -2326

    }
}
