
public class Ball {
	String size;
	String color;
	
	/*
	 * we can define behavior with methods for objects
	 */
	public void bounce(){
	    System.out.println("The " + size + " " + color + " ball is bouncing.");
	}
	
	//this is a reference variable inside of a class
	//reference variables always refer to objects
	public static void main(String[] args) {
	Ball b1 = new Ball();
	Ball b2 = new Ball();
	
	//decalring the initial state
	b1.size = "big";
	b1.color = "red";
	b2.size = "small";
	b2.color = "blue";
	
	//invoke the bounce method 
	b1.bounce();
	b2.bounce();
	}
	
}
