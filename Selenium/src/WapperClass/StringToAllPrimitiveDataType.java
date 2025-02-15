package WapperClass;

public class StringToAllPrimitiveDataType {

	public static void main(String[] args) {

		
		String s1 = "1234";
		String s2 = "1234";

		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		String s3 = "12.43";
		String s4 = "12.67";
		
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
		
		
		String s5 = "true";
		
		System.out.println(Boolean.parseBoolean(s5));

	
		String s6 = "weloc";
		
	//	System.out.println(Charater.p);// it is possbile String to charater because string is a define single chart

	}

}
