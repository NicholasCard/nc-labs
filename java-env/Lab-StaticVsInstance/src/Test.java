
public class Test {

	public static void main(String[] args) {
		
		A.staticCount = 2494;
        System.out.println("class A staticCount: " + A.staticCount);
		
        A a = new A();
		
		System.out.println(a.instanceCount);
		System.out.println(A.staticCount);
		
		A a2 = new A();

        System.out.println(a2.instanceCount);
        System.out.println(A.staticCount);
        
        
        
        /*
         * the staticCount counts to 2 because its calling the static 
         * variable in the class rather than creating a new object
         * 
         */
        
        
        a.instanceCount = 15;

        System.out.println("object a instanceCount: " + a.instanceCount);
        System.out.println("object a2 instanceCount: " + a2.instanceCount);
	}
}
