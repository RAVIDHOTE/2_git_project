package methods;

public class Non_static2 {
	
	public void f1() {
		System.out.println("THis is non-static testing 1");
		}

		public void f2() {
		System.out.println("This is non-static testing 2");
		}

		public static void main(String [] args) {
		System.out.println("Non-static testing successfull");
		Non_static2 e1 = new Non_static2();
		e1.f1();
		e1.f2();
		}

}
