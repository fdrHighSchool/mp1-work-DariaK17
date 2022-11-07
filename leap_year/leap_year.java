
/**
 * Write a description of class leap_year here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class leap_year
{
    public static void main(String [] args){
        int year=1900;
        System.out.println(isleapyear(year));
    }
    public static boolean isleapyear(int year) {
        boolean status = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                     status = true;
                }
            }
            else {
                status = true;
            }
        }
        return status;
    }
}