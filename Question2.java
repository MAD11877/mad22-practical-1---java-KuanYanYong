import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner input = new Scanner(System.in);  // Create a Scanner object
        
    
    double weight = input.nextDouble();
        
        
    double height = input.nextDouble();

    double bmi = weight / (height * height);

    System.out.println(bmi);
  }
}
