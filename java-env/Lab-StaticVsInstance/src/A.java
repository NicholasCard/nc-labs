
public class A {

	//static member
	public static int staticCount = 0;
	
	//instance member
	public int instanceCount = 0;
	
	//creates a no arg constructor 
	public A() {
		
		/*taking note that the staticCount 
		 * doesnt need to use the this keyword because it is static
		 * it belongs to the class because of the static keyword
		 * 
		 * instanceCount needs the this keyword because it is an instance
		 * variable and doesnt belong to the class 
		 */
		staticCount++;
		this.instanceCount++;
		
	}
}
