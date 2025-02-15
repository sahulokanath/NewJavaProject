package Typecasting;

// A B=(C) D;


// Type casting of user define classes
public class TypeCastingObject1 {

	public static void main(String[] args) {

		
		
		//Object o =new String("welcome");
		 
		//StringBuffer sb= (StringBuffer)o;
		
		//System.out.println(sb); // r1 -pass ,r2 - pass ,r3- fail
		
		
		
		String o2 =new String("welcome");
		 
		StringBuffer sb2= (StringBuffer)o2;
		
		System.out.println(sb2); // r1 -fail ,r2 - pass ,r3- pass
		
		String o1 =new String("welcome");
		 
		String sb1= (String)o1;
		
		System.out.println(sb1); // r1 -pass ,r2 - pass ,r3- pass
		
		
		Object o =new String("welcome");
		 
		String sb= (String)o;
		
		System.out.println(sb); // r1 -pass ,r2 - pass ,r3- pass
		
		
		
		
		
	}

}
