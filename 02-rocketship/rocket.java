
/**
 * Write a description of class rocket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rocket
{
   public static void main(String[] args) {
       top();
       sides();
       text();
       sides();
       top();
       
   }
   
    public static void top() {
       System.out.println("   /\\");
       System.out.println("  /  \\");
       System.out.println(" /    \\");
    }
    
    public static void sides() {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
    
    public static void text() {
        System.out.println("|United|");
        System.out.println("|States|");
        
    }
}
