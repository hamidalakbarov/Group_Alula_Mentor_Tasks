package interwiew_tasks_Dan.week1;

public class PrintFinra {

    public static void main(String[] args) {
        System.out.println(FINRA(24));
    }
    
    public static String FINRA(int num){
        String result="";

        for (int i = 1; i <=num; i++) {
            if (i%3==0 && i%5==0){
                result+=" FINRA ";
            }
            else if(i%3==0 && i%5!=0){
                result+=" FIN ";
            }
            else if (i%5==0 && i%3!=0) {
                result+=" RA ";
            }else{
                result+=i+" ";
            }


        }
        return result;
        }

}
