
public class StringMethods {

	public static void main(String[] args) {
		String str = "Hello";
		/*
		 * equals is used to test to see if one string is the same
		 * as another
		 */
		System.out.println(str.equals("Hello"));
		
		/*
		 * the length method which returns an int of the amount of
		 * characters in a string
		 * (actually counts and doesnt start at 0)
		 */
		System.out.println(str.length());
		
		/*indexOf() returns the index of a specific character
		 * 
		 */
		System.out.println(str.indexOf("H"));
	}
}
