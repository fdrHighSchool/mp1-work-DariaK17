
/**
 * Write a description of class Lanternfly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    import java.util.Scanner;

public class callculator 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Simple calculator");
        System.out.println(". ");
        
        System.out.print("Enter your first number ");
        int num1 = input.nextInt();
        
        System.out.print("Enter your second number ");
        int num2 = input.nextInt();
        
        System.out.print("What do you want to do with this numbers? ");
        String com = input.nextLine();
    
               
            if (com.equals("add")) {
                  System.out.println(num1 + num2);
            }
            if(com.equals("substranct")) {
                  System.out.println(num1 - num2);
            }   
    } // end main method

} // end class

