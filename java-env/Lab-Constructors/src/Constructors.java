
public class Constructors {
	
	//good idea to put constructors before the main method
	
	public Constructors(int value) {
		System.out.println(value);
	}
	
	//you can add your own default no arg constructor
	//and it will be needed if you add any of your own constructors
	public Constructors() {
		System.out.println("Default constructor ran.");
	}
	
	
	public static void main(String[] args) {
		//instances will be created here
		//the new keyword invokes the constructor that MATCHES
		//the given arguments 
		
		Constructors c = new Constructors(5939);
		Constructors cNoArg = new Constructors();
	}
}
