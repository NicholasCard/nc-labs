
public class ClassB {

	
	/*
	 * this gets a little confusing but essentially it is grabbing the ClassA 
	 * object and referencing it in
	 */
	
	//this declares ClassA as an instance variable inside of ClassB
	ClassA classA = new ClassA();
	
	public static void main(String[] args) {
		//instantiates a new ClassB object
		
		/*
		 * because ClassB has the reference to ClassA we can access the methods 
		 * and execute them 
		 * 
		 * -might have to go over this again it can just get crazy to follow
		 * --also didnt really go over setter and getter methods yet unless i missed it
		 * ---i can look this up on my own i have a general idea
		 * 
		 * --remember that access modifiers make it so this isnt the case every time
		 * depending on class access
		 * 
		 * 
		 * this also gets into the whole parent child relationships as well 
		 */
		ClassB b = new ClassB();
		b.classA.setName("taylor");
		
		System.out.println(b.classA.getName());
	}
}
