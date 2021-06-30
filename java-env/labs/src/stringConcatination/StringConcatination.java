package stringConcatination;

public class StringConcatination {

	public static void main(String[] args) {
        String beginning = "Hello";

        String end = " World";
        String combo = beginning + end;

        System.out.println(combo);
        
        long l = 203L;
        System.out.println("The value of l: " + l);
        
        boolean b = true;
        System.out.println(b + " is true");
        
        /*
         * order matters but JHava knows if its a String or a numeric data type
         */
        int x = 2;
        int y = 3;
        System.out.println(x + y + " is the sum of x and y");
    }
}
