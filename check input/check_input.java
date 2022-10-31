
/**
 * Write a description of class check_input here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class check_input
{
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String point1; 
        String point2;
        do {
            System.out.println("Please enter your point in format (x, y): ");
            
            point1 = s.nextLine();
            if (checkInput(point1) != true){
                System.out.println("You enterned the point in incorectly.");
            }
            
        } while(checkInput(point1) != true);
        do {
            System.out.println("Please enter your second point in format (x, y): ");
            
            point2 = s.nextLine();
            if (checkInput(point2) != true){
                System.out.println("You enterned the point in incorectly.");
            }
            
        } while(checkInput(point2) != true);
        
        int x1 = (getX(point1));
        int y1 = (getY(point1));
        int x2 = (getX(point2));
        int y2 = (getY(point2));
        System.out.println("The x value is " + x1);
        System.out.println("The y value is " + y1);
   }// end of main
    //N: Check input
    //P: determine wether or not the input folow correct format
    //I: string user typed in
    //R: true/false
   public static boolean checkInput(String p) {
       boolean status = true;
       
       
       if (p.indexOf("(") != 0) {
          status = false;
        }
       if (p.indexOf(")") != p.length() - 1) {
          status = false;
        }
        if (p.indexOf(", ") == -1) {
           status = false;
       }
        return status;
    }// end of checkInput
   public static int getX(String point) {
    // determine where the comma is located
    int commaPos = point.indexOf(",");   

    // grab substring from after parentesis up to comma
    String x = point.substring(1, commaPos);

    // return value back to main so it can be used later in the program
    return Integer.parseInt(x);
      } // end getX method
   
    public static int getY(String point) {
    int pos = point.indexOf(",") + 2;  
    int pos1 = point.indexOf(")");
    
    String y = point.substring(pos, pos1);      
         
    return Integer.parseInt(y);   
   }//end of getY method



}  // end of class

