/**
 * Description for 7.04 Weight project
 *
 * @author Tony Bonadio
 * @version 12/30/15
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.PrintWriter;

public class WeightOnPlanetsV1
{
public static void printHeading(){
System.out.println("      My Weight on the Planets     ");
System.out.printf("%9s%13s%15s", "Planet", "Gravity", "Weight(lbs)");
System.out.println("\n  ------------------------------------");


}

public static double [] readFile() throws IOException{
     double[] gravity = new double [8]; 
     Scanner inFile = new Scanner(new File("gravityv1.txt"));
     int count = 0;
     while (inFile.hasNext()){
        double temp = inFile.nextDouble();
        gravity[count] = temp;
        count++;
     }
     inFile.close();
     return gravity;
}

public static double[]calculateWeight(double [] gravity)throws IOException{
   double mass; 
   double[] weight = new double[8]; 

   for (int a = 0; a < 8; a++){ 
     mass = 155;
     weight[a] = (mass*gravity[a]);
   }
   return weight;
}

public static void main (String[] args)throws IOException{ 
  printHeading();
  String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
  double [] gravity = readFile();
  double [] weight = calculateWeight(gravity);          
  for(int y = 0; y < 8; y++)
  {
     System.out.printf("%-11s", names[y]);     
     System.out.printf("%13.2f", gravity[y]); 
     System.out.printf("%20.2f\n",weight[y]);
  }
} 
}