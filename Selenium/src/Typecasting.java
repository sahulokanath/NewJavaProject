
public class Typecasting {

	public static void main(String[] args) {

		// Upcasting -converting value form small to larger
		// Downcasting - converting value form larger to small
		
		
		int n =10;
		double d=n; //Upcasting
		
		System.out.println(d);
		
		double d1=45.78;
		int n1=(int) d1; // we have to change manually add the int because here we are doing downcasting 
		System.out.println(n1);
		
		float f=45.34f; 
		double d2=f;//Upcasting
		
		System.out.println(d2);
		
		double d3=100.45;
		float f1=(float) d3 ;
		
		System.out.println(f1);
		
		
		/*
		char c='a';
		String s=c; // primitive  to primitive we can convert
		*/
		
		}

}
