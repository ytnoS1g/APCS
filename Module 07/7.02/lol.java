 import java.util.Arrays;
/**
 * A program that uses static methods to convert units of measurement
 * 
 * @author Tony Bonadio
 * @version 12/10/15
 */
public class lol{
    public static void main(String[] args){
     
       int[ ] array = new int[3];
int index = 1;
array[index] = index - 1;
index++;
array[index] = array[index - 1] - 1;
array[index - 2] = index % 3; 
System.out.print(array);
    }//end of main method
    
}//end of class
