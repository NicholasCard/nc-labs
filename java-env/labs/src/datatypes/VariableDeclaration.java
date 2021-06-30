package datatypes;

public class VariableDeclaration {

	 public static void main(String[] args){
	        //boolean on = true;
	        boolean on = false;
	        System.out.println(on);
	        
	        short s = 16;
	        System.out.println(s);
	        
	        int i = -32;
	        System.out.println(i);
	        
	        //unresolved compilation problem
	        /*we have to specify it to be a float because
	         * the compiler by default expects the number with decimals
	         * to be a double type value
	         * this means we have to specify that we want it to be a float
	         * 
	         * we do this by putting f after the value
	         * */
	         
	        float f = 3839.34839f;
	        System.out.println(f);
	        
	        /*
	         * same thing as above just the size of the number is too big
	         */
	        long l = 4294967296l;
	        System.out.println(l);
	        
	        char c = 'a';
	        System.out.println(c);
	    }
}
