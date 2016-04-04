import java.util.Random;
import java.util.Scanner;

/**
 * Project title: 05.04 for Loops
 * 
 * Purpose of Project: Randomally chooses a number with a for loop and if both, front or end
 * pairs match then you win the lottery.
 * 
 * @version 11/11/2015
 * 
 * @author Tony Bonadio
 */

public class Lottery {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Random random = new Random();
		String randomNumber = "";
		String guess = "";
		
		for(int i = 0; i < 3; i++) {
			int randomNum = (int)(Math.random()*10);
			randomNumber += Integer.toString(randomNum);
		}
		
		System.out.print("Please enter your three numbers (e.g 123): ");
		guess = in.nextLine();
		
		if (guess.equals(randomNumber)) {
			System.out.print("Congrats! Both pairs matched.");
		}
		else if (guess.substring(0, 2).equals(randomNumber.substring(0, 2))) {
			System.out.print("Congrats! Front pairs matched. The winning number is: " + randomNumber);
		}
		else if (guess.substring(1, 3).equals(randomNumber.substring(1, 3))) {
			System.out.print("Congrats! End pairs matched. The winning number is: " + randomNumber);
		}
		else {
			System.out.print("Sorry no match. You only had a 1/100 chance anyway. The winning number is: " + randomNumber);
		}
	}

}