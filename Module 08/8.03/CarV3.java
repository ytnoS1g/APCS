/**
 * This program calculates the fuel economy of a car.
 * 
 * @author Tony Bonadio
 * @version 1/5/16
 */
public class CarV3
{
   // private instance variables
    String Model1 = "13 Toyota Camry";
    int endMiles1, startMiles1, distance1;
    double gallonsUsed1, pricePerGallon1;
 
 
    CarV3()
    {
    }
 
    CarV3 (String m1, int e1, int s1, double gU1, double pPG1)
    {
      String Model1 = m1;
      endMiles1 = e1;
      startMiles1 = s1;
      gallonsUsed1 = gU1;
      pricePerGallon1 = pPG1;
    }
 
    public int distance()
    { 
      distance1 = endMiles1 - startMiles1;
      return distance1;
    }
 
    public double calcMPG() 
    {
        return distance1 / gallonsUsed1;
    }
 
    public double calcGPM()
    {
        return gallonsUsed1 / distance1;
    }
 
    public double totalCost()
    { 
        return pricePerGallon1 * gallonsUsed1;
    }
 
    public void print(int distanceA, double mpg1, double gpm1, double totalP)
 
    {
 
 
        System.out.printf("%100s\n","====================================================================================================");
 
        System.out.printf("%98s\n" , "Type of Car   Start Miles   End Miles   Distance   Gallons   Price   Cost   Miles/Gal   Gal/Mile");
         System.out.printf("%100s\n","====================================================================================================");
 
        System.out.printf("%10s%14d%13d%11d%11.1f%11.1f%11.1f%11.1f%11.2f\n", Model1, startMiles1, endMiles1, distanceA, gallonsUsed1, pricePerGallon1, totalP, mpg1, gpm1);
    }
    public static void main(String [] args)
    { 
        CarV3 car1 = new CarV3("13 Toyota Camry", 80850, 80421, 16.1, 2.21);
        int distanceA = car1.distance();
        double mpg1 = car1.calcMPG();
        double gpm1 = car1.calcGPM();
        double totalP = car1.totalCost();
 
 
       car1.print(distanceA, mpg1, gpm1, totalP);
 
 
    }
}