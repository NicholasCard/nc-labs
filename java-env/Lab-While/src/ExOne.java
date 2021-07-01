
public class ExOne {

	public static void main(String args[]){
    	boolean on = true;

    	//make sure you dont create infinite loops
    	while (on){
    		System.out.println("Inside the while loop");
    		on = false;
    	}
	}
}
