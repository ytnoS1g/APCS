/*
 * Author: Tony Bonadio
 * Date: 4/4/2016
 * Purpose: mirror your homework and then to create instances for different subject matter
 * 
 */
public class MyMath extends Homework
{
	//constructor
	MyMath()
	{
		super();
	}

	//implemented create assignment method
	public void createAssignment(int p) 
	{
		pagesRead = p;
		typeHomework = "Math";
	}
	
	//other methods
	//to string
	public String toString()
	{
		return typeHomework + " - must read " + pagesRead + " pages";
	}
}