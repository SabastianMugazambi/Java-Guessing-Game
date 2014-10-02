//By Sabastian Mugazambi
//importing necessarry libraries. 
import java.util.Scanner;
import java.lang.*;

public class Guess{
	public static void main(String[] args) {
		//randomly creating a number and assigning it a variable
		double rawNum = Math.random();

		//transforming it to be in the required range. 
		double semiRandomNum = rawNum*100;

		//rounding it up to create the perfect integer. 
		double randomNum = Math.round(semiRandomNum);
		int randomInt = (int)randomNum;

		// making the variable name for the guessed number an interger. 
		int guessed; 
   		
   		//creating a scanner object that will allow me to get the intu of the user at all times.
   		Scanner user = new Scanner(System.in);
		System.out.print("Enter a number: ");

		//a loop that only terminates if the conditions inside are met, thats if the user input equals the random integer. 	    
		while ((guessed = user.nextInt()) != randomInt) {

			//creating the loop for the case where the user input is larger. 
			if (guessed > randomInt) {
				System.out.println("Smaller!");
				System.out.print("Enter a number: ");
				}

			//creating the loop for the case where the user input is smaller. 
			else {
				System.out.println("Larger!");
				System.out.print("Enter a number: ");				
			     }
            }
            
		
         // This poves that the number entered is equal to the random number and the loop is broken. 
       	 System.out.println("you got it!"); 

	}
}