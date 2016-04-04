/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * ©FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 *
 * Modified by: Tony Bonadio
 * Date: 9/28/2015
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles;                   // distance in miles
        double feet;                    // distance in feet
        double feetPerMile = 5280;      // number of feet per 1 mile
        double milePerFeet = 0.00018; //number of miles per 1 feet
        double kilometers;              // distance in kilometers
        double milePerKilometer = 0.621; // number of miles per 1 kilometer
        double kilometerPerMile = 1.609; //number of kilometers per 1 mile
        double pounds;                  // weight in pounds
        double kilograms;               // weight in kilograms
        double poundPerKilogram = 2.204; //number of pounds per 1 kilogram
        double kilogramPerPound = 0.453; //number of kilograms per 1 pound
        double gallons;                 // amount in gallons
        double liters;                  // amount in liters
        double gallonPerLiter = 0.264; //number of gallons per 1 liter
        double literPerGallon = 3.785; //number of liters per 1 gallon
        double inches;                  //distance in inches
        double feetPerInches = 0.083;   //number of feet per 1 inch
        double inchesPerFeet = 12.0;    //number of inches per 1 foot
        //...finish declaring local variables here, including end of line
        //...comments doccumenting purpose of each variable
        System.out.println("***************************************");
        System.out.println("     This program converts between     ");
        System.out.println("     selected units of measurement .   ");
        System.out.println("***************************************");

        //convert feet to miles
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");


        //convert miles to feet
        miles = 2.1;
        feet = miles / milePerFeet;
        System.out.println(miles + " mi. = " + feet + " ft.");
        
        //convert miles to kilometers
        miles = 5.0;
        kilometers = miles / milePerKilometer;
        System.out.println(miles + " mi. = " + kilometers + " km.");

        //convert kilometers to miles
        kilometers = 5.0;
        miles = kilometers / kilometerPerMile;
        System.out.println(kilometers + " km. = " + miles + " mi.");
        
        //convert pounds to kilograms
        pounds = 3.0;
        kilograms = pounds / poundPerKilogram;
        System.out.println(pounds + " lbs. = " + kilograms + " kg.");
        
        //convert kilograms to pounds
        kilograms = 15.0;
        pounds = kilograms / kilogramPerPound;
        System.out.println(kilograms + " kg. = " + pounds + " lb.");
        
        //convert gallons to liters
        gallons = 7.0;
        liters = gallons / gallonPerLiter;
        System.out.println(gallons + " gal. = " + liters + " li.");
        
        //convert liters to gallons
        liters = 5.0;
        gallons = liters / literPerGallon;
        System.out.println(liters + " li. = " + gallons + " gal.");
        
        //convert feet to inches
        feet = 3;
        inches = feet / feetPerInches;
        System.out.println(feet + " ft. = " + inches + " in.");
        
        //convert inches to feet
        inches = 36;
        feet = inches / inchesPerFeet;
        System.out.println(inches + " in. = " + feet + " ft.");
    }//end of main method
}//end of class
