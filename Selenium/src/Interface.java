
interface Demo
{
	int length =60;
	int weigth=50;
	
	
	void m();
	
	default void m1()
	{
		System.out.println("This is default method");
	}
	
	static void m2()
	{
		System.out.println("This is a static method of interface");
	}
}

public class InterfaceDemo implements Demo 	
{
	void m()
	{
		
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
