
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 * 
 * 
 * @author Tony Bonadio
 * @version 9/17/2015
 */
public class CalculationsV5
{
    public static void main(String[ ] args)
    {
        // Addition
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 16;
        int iNum4 = -2;
        int iNum5 = 15;
        int iNum6 = 10;
        int iNum7 = 5;
        int iNum8 = 234;
        int iNum9 = 6;
        int iNum10 = 12;
        int iNum11 = 3;
        int iNum12 = 11;
        int iNum13 = 24;
        int iNum14 = 17;
        int iNum15 = 2;
        int iNum16 = 480;
        int iNum17 = 200;
        int iNum18 = 20;
        int iNum19 = 8;
        
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        double dNum3 = 5.0;
        double dNum4 = 46.2;
        double dNum5 = 2.5;
        double dNum6 = .5;
        
        
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " equals " + (iNum1 + iNum2) );
        System.out.println( dNum1 + " + " + dNum2 + " + " + dNum3 + " equals " + (dNum1 + dNum2 + dNum3) );
        //System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3 + " - " + iNum2 + " - " + iNum1 + " equals " + (iNum3 - iNum2 - iNum1) );
        System.out.println(dNum2 + " - " + dNum3 + " equals " + (dNum2 - dNum3) );
        //System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " * " + iNum2 + " equals " + (iNum1 * iNum2) ); 
        System.out.println(dNum2 + " * " + dNum3 + " * " + dNum3 + " equals " + (dNum2 * dNum3 * dNum3) );
        //System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " / " + iNum1 + " equals " + (iNum2 / iNum1) );
        System.out.println( "dNum1 / dNum3 equals " + (dNum1 / dNum3) );
        //System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 + " % " + iNum2 + " equals " + (iNum3 % iNum2) );
        System.out.println(dNum3 + " % " + dNum2 + " equals " + (dNum3 % dNum2) );
        //System.out.println();
        
        // 2.02 Lab Equations
        System.out.println("Lab Equations");
        System.out.println(iNum5 + " divided by " + dNum5 + " times " + iNum4 + " plus " + iNum6 + " / " + iNum7 + " equals " + (iNum5/dNum5 + iNum4 + iNum6/iNum7) );
        System.out.println(iNum8 +" minus ("+ iNum8 + " divided by " + iNum9 + " modulus " + iNum10 +") + " + iNum11 + " equals " + (iNum8 - iNum8/iNum9 % iNum10 + iNum11) );
        System.out.println("(" + dNum4 + " divided by " + iNum12 + ") minus " + iNum11 +  " plus " + iNum13 + " modulus (" + iNum14 + " minus " + iNum15 + " times " + iNum11 + ") equals " + (dNum4/iNum12 - iNum11 + iNum13 % iNum14-iNum15*iNum11) );
        System.out.println(iNum16 + " divided by " + iNum6 + " divided by " + iNum10 + " plus " + iNum17 + " * " + dNum6 + " minus " + iNum18 + " modulus " + iNum19 + " equals " + (iNum16/iNum6/iNum10 + iNum17 * dNum6 - iNum18 % iNum19) );
        
        // 2.03 Additional int Equations
        System.out.println("Additional int Equations");
        System.out.println(iNum17 + " plus " + iNum16 + " minus " + iNum1 + " times " + iNum2 + " equals " + (iNum17+iNum16-iNum1*iNum2) );
        System.out.println(iNum15 + " modulus " + iNum4 + " plus " + iNum5 + " divided by " + iNum7 + " equals " + (iNum15%iNum4+iNum5/iNum7) );
        
        //2.04 Additional double Equations
        System.out.println("Additional double Equations");
        System.out.println(dNum3 + " plus " + iNum2 + " minus " + dNum2 + " divided by " + iNum3 + " equals " + (dNum3+iNum2-dNum2/iNum3) );
        System.out.println(dNum2 + " times " + iNum15 + " modulus " + dNum1 + " plus " + iNum5 + " equals " + (dNum2*iNum15%dNum1+iNum5) );
               
    } // end of main method
} // end of class
