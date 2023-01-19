package interview_tasks_week3_Mahdi;

public class ReverseNegative {
    public static void main(String[] args) {


            System.out.println(revereNegativeDigit(-755));// >> -557
        }

        public static int revereNegativeDigit ( int num){

            if (num > 0) {// if num is positive
                return num;// return num
            }
            String str = "" + num;// convert int to String
            String result = "";
            for (int i = str.length() - 1; i > 0; i--) {// reverse format
                result += str.charAt(i);
            }
            int reverseNegative = Integer.parseInt(result);// convert String to int
            return (-reverseNegative);
        }
    }
