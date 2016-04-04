/*
 * Author: Tony Bonadio
 * Date: 4/4/2016
 * Purpose: mirror your homework and then to create instances for different subject matter
 */
public abstract class Homework 
{
	//variables
	public int pagesRead;
	public String typeHomework;
	
	//constructor
	Homework()
	{
		pagesRead = 0;
		typeHomework = "none";
	}
	
	//other methods
	
	//create assignment
	public abstract void createAssignment(int p);
	
}