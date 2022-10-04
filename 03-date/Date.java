
/**
 * Write a description of class Date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Date
{
   public static void main(String [] args) {
       Scanner s = new Scanner(System.in);
       
       System.out.println("What day of the week is it?");
       String day = s.nextLine();
       
       System.out.println("What month is it?");
       String month = s.nextLine();
       
       System.out.println("What year is it?");
       String year = s.nextLine();
       
       System.out.println("What day of the month is it?");
       String date = s.nextLine();
       s.close();
       
       System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
       System.out.println("European method: " + day + " " + date + " " + month + " " + year);
    }// end of main
}// end of class
