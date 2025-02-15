package InterfaceAndAbustartion;

interface Demo {
	int lenght = 7;
	int weigth = 6;

	void m1();

	default void m2() {
		System.out.println("This is default method");
	}

	static void m3() {
		System.out.println("This is Staitc method");
	}
}

class InterfaceDemo implements Demo {
	public void m1() {
		System.out.println("This Class public method");
	}

	public void m4() {
		System.out.println("This class methods");
	}

}

public class InterFace {

	public static void main(String[] args) {

		InterfaceDemo objd = new InterfaceDemo();

		objd.m1();// abstaratce method
		objd.m2();// default method
		Demo.m3();// Static method

		System.out.println(Demo.lenght * Demo.weigth); // Final and static variable 

		Demo d = new InterfaceDemo();

		d.m1();
		d.m2();
		Demo.m3();
		d.m4(); // We can't acccess m4 method because referance type is Demo (intreface) type 

		//class to interface is possible but interfcace to class is not possible 
	}

}
