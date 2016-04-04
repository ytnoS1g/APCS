/**
 * Description for 7.04 Weight project
 *
 * @author Tony Bonadio
 * @version 12/30/15
 */
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;


public class gravityV1 {
/**
 * @param args
 */

public static double calculateSurfaceGravity(double d, double M)    
    {
    double G = 6.67 * Math.pow(10, -11);
    double r = d;
    double g;

    g = (G * M/Math.pow(r/2*1000, 2))/9.81;
    

    return g;
}

public static void printResultsToScreen(String planetName, double diameterKm, double massKg, double g)
    {

    System.out.printf("%-15s%-17.0f%-17.2e%.2f%n", planetName, diameterKm, massKg, g);

}

public static void writeResultsToFile(double g) throws IOException
    {

    PrintWriter outFile = new PrintWriter(new FileWriter("gravityv1.txt", true)); 

    outFile.printf("%.2f%n", g);
    outFile.close();
}

public static void main(String[] args) throws IOException 
    {
    // Variables
    String [] planetName = new String[8];
    planetName[0] = "Mercury";
    planetName[1] = "Venus  ";
    planetName[2] = "Earth  ";
    planetName[3] = "Mars   ";
    planetName[4] = "Jupiter";
    planetName[5] = "Saturn ";
    planetName[6] = "Uranus ";
    planetName[7] = "Neptune";
    double [] diameterKm = new double[8];
    diameterKm[0] = 4880;
    diameterKm[1] = 12103.6;
    diameterKm[2] = 12756;
    diameterKm[3] = 6794;
    diameterKm[4] = 142984;
    diameterKm[5] = 120536;
    diameterKm[6] = 51118;
    diameterKm[7] = 49532;
    double [] massKg = new double[8];
    massKg[0] = 3.30 * Math.pow(10, 23);
    massKg[1] = 4.869 * Math.pow(10, 24);
    massKg[2] = 5.97 * Math.pow(10, 24);
    massKg[3] = 6.4219 * Math.pow(10, 23);
    massKg[4] = 1.900 * Math.pow(10, 27);
    massKg[5] = 5.68 * Math.pow(10, 26);
    massKg[6] = 8.683 * Math.pow(10, 25);
    massKg[7] = 1.0247 * Math.pow(10, 26);
    double [] g = new double[8];
    int array = 0;

    //code

    System.out.printf("%s%20s%15s%15s%n", "Planet", "Diameter (km)", "Mass (kg)", "g (m/s^2)");

    for(double d : diameterKm)
        {
        g[array] = calculateSurfaceGravity(d, massKg[array]);
        printResultsToScreen(planetName[array], d, massKg[array], g[array]);
        writeResultsToFile(g[array]);
        array++;
    }
}

}