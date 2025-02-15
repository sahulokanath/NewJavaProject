package Excepation;

public class UnCheckedExpceptaion {

	public static void main(String[] args) {
		
		
		String name="lock";
		
		String val=null;
		
	    try
		{
			int num= Integer.parseInt(name);
			System.out.println(num); // we are converting string number 
			System.out.println(val.length()); // we are printing string length 
		}
		catch(NumberFormatException n)
		{
			System.out.println("We can't convert string to number"); 
		}
		catch(NullPointerException p)
		{
			System.out.println("String could not be null");
		}
		catch(Exception e) // if we dont know about what is the exception name we define exception 
		{
			
		}
	
		
	}

}

