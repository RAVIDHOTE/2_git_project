package methods;

public class Non_static {
	
	//Non Static method
		//In non static method static keyword is not present
		
		//To call non static method
		//We need to create Object to call the non static method
		//Object is directly proportational to class
		//Object is instance/example of class and used to call non static method
		//Object is copy/blueprint of class
		
		//standard syntax for non static method
		//public void MethodName() {   Body of the program
		//  }
		
		//Standard syntax for object creation 
		//Class Name Object_refVariable = new Constructor ();
		//Class Name Object_refVariable = new Class Name ();
		/*we can provide any name to object_refvariable like in this 
		 * case we are giving the name of object R.
		 * Also we can starts object name with any case upper or lower
		 */
		
		//to call non static method 
		//Object Refvaribale.MethodName();
	
	int a = 10;
	int b = 20;

	public void m1() {
	System.out.println(a+b);
	}

	public void m2() {
	System.out.println(b-a);
	}

	public static void main(String [] args) {

	Non_static r1 = new Non_static();
	r1.m1();
	r1.m2();
	}

}
