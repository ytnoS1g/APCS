import java.util.Scanner;

/*
 * Name: Tony Bonadio
 * Date: 2/18/2016
 * Purpose: Translate Piecewise functions into recursive methods.
 */
public class Recursion2
{
	public static void main(String[] args)
	{
		//prompt
		System.out.print("Enter a number to be input to the piecewise function: ");

		//create object
		Recursion2 problem = new Recursion2();

		//get user input
		Scanner in = new Scanner(System.in);
		double number = in.nextDouble();

		//print out the evaluation
		System.out.println(problem.piecewise(number));
	}

	//piecewise function
	public double piecewise(double x)
	{
		//base case
		if(x  <= 8)
		{
			return -2;
		}
		else
		{
			return piecewise(-2*x-3)+8;
		}
	}
}