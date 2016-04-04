import java.util.Scanner;

/*
 * Name: Tony Bonadio
 * Date: 2/18/2016
 * Purpose: Translate Piecewise functions into recursive methods.
 */
public class Recursion3
{
	public static void main(String[] args)
	{
		//prompt
		System.out.print("Enter a number to be input to the piecewise function: ");

		//create object
		Recursion3 problem = new Recursion3();

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
		if(x > 20)
		{
			return -100;
		}
		else
		{
			return piecewise(x * 2) - 4;
		}
	}
}