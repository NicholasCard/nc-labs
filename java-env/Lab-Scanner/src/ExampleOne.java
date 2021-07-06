/*
 * you have to import the scanner from the util class for java 
 * because it is not a default package
 */

import java.util.Scanner;

public class ExampleOne {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//this is just to prompt the user what to type
		System.out.println("Please type in a line and hit Enter.");
		
		//now we have to wait and grab the user input
		String line = scanner.nextLine();
		
		System.out.println("you have typed: " + line);
		
		/*
		 * we have to close the scanner so we release the resources back
		 * if we dont close the scanner it will be just out there 
		 * just finalizing that we are done with the scanner
		 */
		
		scanner.close();
		
		/*
		 * hasNext() returns true if the scanner has another token in its input
		 * in this case it runs the while loop if there are still tokens and the 
		 * nextInt() method converts the token to an int
		 * 
		 * 
		 * -this is semi confusing because tokens are weird
		 * not sure what is doing the parsing
		 * 
		 * seems like the nextInt automatically parses the string into an int and the 
		 * while loop just makes sure theres still something there
		 *  
		 */
		String numbers = "1 2 3 4 5 6 7 8";
	
		System.out.println(numbers);
		scanner = new Scanner(numbers);
		while (scanner.hasNextInt()) {
			System.out.println(scanner.nextInt());
		}
		scanner.close();
		
	}
	
}
