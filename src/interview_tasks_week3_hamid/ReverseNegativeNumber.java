package interview_tasks_week3_hamid;

import java.util.*;
import java.util.function.Consumer;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        Consumer<Integer> reversedNegativeInt = a -> {

            String str = a + "";

            List<Integer> reversed = new ArrayList<>();

            for (int i = str.length() - 1; i > 0; i--) {
                reversed.add(Integer.parseInt("" + str.charAt(i)));
            }

            System.out.print('-');
            for (Integer eachInteger : reversed) {
                System.out.print(eachInteger);
            }
        };
        reversedNegativeInt.accept(-45600500);
    }
}
/*
Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
 */