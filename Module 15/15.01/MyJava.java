/*
 * Author: Tony Bonadio
 * Date: 4/4/2016
 * Purpose: mirror your homework and then to create instances for different subject matter
 * 
 */
public class MyJava extends Homework
{
	//constructor
	MyJava()
	{
		super();
	}

	//implemented create assignment
	public void createAssignment(int p) 
	{
		pagesRead = p;
		typeHomework = "Java";
	}

	//other methods
	//to string
	public String toString()
	{
		return typeHomework + " - must read " + pagesRead + " pages";
	}
}