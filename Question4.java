import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner input = new Scanner(System.in);
    int value = input.nextInt();

      

    for (int i = value - 1; i >= 0; i--) {
        for (int j = i; j >= 0; j--)
            System.out.print("*");
        System.out.println();
    }

  }
}
