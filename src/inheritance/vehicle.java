package inheritance;

public class vehicle {

	public static void main(String [] args){
		vehicle v = new vehicle();                  //here we can  make object from vehicle in its own class  but its useless because
		tuck t= new tuck();              			//	vehicle is not associated with inheritance and there is no run time polymorphism
													// so we cant use vehicle object to implement methods of cars and tuck class.
												// moreover we cant create non static methods inside static methods.	
		         		
		t.m1();
		t.m2();
		System.out.println(t.toString());
	
	}
}
