package WapperClass;

public class AllPrimitiveTypeToString {

	public static void main(String[] args) {

		int a = 10;
		double d = 40.53;
		char c = 't';
		boolean b = true;

		// Here we can acchive method overloading Polymerphiom 
		
		
		String s=String.valueOf(b);
		System.out.println(s);
		
		s=String.valueOf(c);
		System.out.println(s);
		
		s=String.valueOf(d);
		System.out.println(s);
		
		s=String.valueOf(a);
		System.out.println(s);
		
	}

}
