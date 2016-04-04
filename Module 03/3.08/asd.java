
/**
 * This program demonstrates how to accept user input as a String
 * with the next() method, then convert the String into a double value
 * or an int value
 * 
 * ©FLVS 2007 
 * @author B. Jordan 
 * @version 03/07/07
 */
import java.util.Scanner;           //import methods of the Scanner class
public class asd
{
    public static void main(String[ ] args)
    {
           Scanner in = new Scanner(System.in); 
           System.out.print("Please enter your name (first last): "); 
           String firstName = in.Next();
    }//end of main method
}//end of class