package methods;

public class Non_static {
	
	
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
