/*
 * Author: Tony Bonadio
 * Date: 4/4/2016
 * Purpose: mirror your homework and then to create instances for different subject matter
 * 
 */
public class MyEnglish extends Homework
{
	//constructor
	MyEnglish()
	{
		super();
	}

	//implemented create assignment method
	public void createAssignment(int p) 
	{
		pagesRead = p;
		typeHomework = "English";
	}

	//other methods
	//to string
	public String toString()
	{
		return typeHomework + " - must read " + pagesRead + " pages";
	}
}