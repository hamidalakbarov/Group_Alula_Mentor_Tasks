package interview_tasks_Sohaila.week04;

import java.util.*;

public class SameLetters {

    /**String
     Same letters
     Write a return method that check if a string is build out of the same letters as another string.
     Ex: same(" abc ",","cab"); --> true
     same("abc abb "); --> false */

    public static boolean sameLetters(String x, String y){

        char[] ax = x.toCharArray();
        char[] ay = y.toCharArray();

        Arrays.sort(ax);
        Arrays.sort(ay);

        if (x.length() != y.length()){
            return false;
        } else {
            for (int i = 0, j= 0; i < ax.length; i++, j++) {

                if (ax[i] != ay[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sameLetters2(String x, String y){

        Set <String> lx = new TreeSet<>(Arrays.asList(x.split("")));
        Set <String> ly = new TreeSet<>(Arrays.asList(y.split("")));

        if (lx.equals(ly)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(sameLetters("abcd", "acbd"));
        System.out.println(sameLetters("abb", "abc"));

        System.out.println(sameLetters2("abc", "acb"));
        System.out.println(sameLetters2("abb", "abc"));
    }
}
