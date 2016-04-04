import java.util.ArrayList;
/**
 * Displays stats on cars recorded over time.
 * 
 * @author Tony Bonadio
 * @version 1/7/16
 */

public class AnnualFuelUseTester{
    
    public static void main(String[ ] args){
       int sum = 0, k, val = 1;
for (k = 0; k <= 6; k++) 
{
        sum += val;
        val++;
}
System.out.println(sum);
    }
    
}