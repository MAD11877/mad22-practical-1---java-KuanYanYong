import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        /**
         * Prompt the user for number. This input indicates the number of integers the user will be entering next.
         * Print out the mode (highest occurrence) from the set of integers.
         *    e.g.
         *     > 5
         *     > 2
         *     > 4
         *     > 1
         *     > 3
         *     > 4
         *     4
         *
         *    e.g.
         *     > 4
         *     > 2
         *     > 2
         *     > 3
         *     > 3
         *     2
         * Hint: Use a loop to get input. Use another 2 loops to find the mode
         */
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        ArrayList<Integer> distinctNumberList = new ArrayList<>();

        for (int i = 0, max = input.nextInt(); i < max; i++) {
            numberList.add(input.nextInt());
        }

        for (int number : numberList) {
            if (!distinctNumberList.contains(number)) {
                distinctNumberList.add(number);
            }
        }

        int max = 0;
        int num = 0;

        for (int distinctNumber : distinctNumberList) {
            int count = Collections.frequency(numberList, distinctNumber);

            if (count > max) {
                max = count;
                num = distinctNumber;
            }
        }

        System.out.println(num);
    }
}
