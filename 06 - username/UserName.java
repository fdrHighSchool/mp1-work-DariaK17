
/**
 * Write a description of class username here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random ;
public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Enter your favorite number: ");
    String favNum = s.nextLine();
    // test output
    System.out.println("Hello " + firstName + " " + initialize(lastName) + ". " + favNum);
    System.out.print("Are you a student or a teacher? ");
    String q = s.next();
    q= q.toLowerCase();
    if (q.equals ("student")){
        System.out.println(firstName + initialize(lastName) + favNum + "@nycstudents.net");
    }// end if 
    else{
         System.out.println(initialize(firstName) + lastName + favNum + "@schools.nyc.gov");
    }// end else 
    System.out.print("What length would you like your password to be? ");
    int length = s.nextInt();
    gPass(length);
    s.close();
 
    } // end main 

  public static String gPass (int length) {
    String password = "";
        for (int i = 0; i < length; i++) {

          int num = (int)(Math.random()*(3 - 1 +1)+1);
          if (num == 1) {
              int num0 = (int)(Math.random()*(122 - 97 +1)+97);
              char c = (char) num0;
              password += c;
            }
          else if (num == 2){
              int num1 = (int)(Math.random()*(90-65 +1)+65);
              char c1 = (char) num1;
              
              password += c1;
          }
          else {
              int num2 = (int)(Math.random()*(57-48 +1)+48);
              char c2 = (char) num2;
              password += c2;
          }
    }
        System.out.println("Your password is " + password + ".");
        return password;
  }
    /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
    public static String initialize(String n) {
        return n.substring(0, 1);
    } // end initialize method

} // end class

