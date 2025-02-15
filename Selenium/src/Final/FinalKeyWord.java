package Final;

public class FinalKeyWord 
{
	final int a=10;
	

	public static void main(String []args)
	{
		
		FinalKeyWord f =new FinalKeyWord();
		
		f.a=70; // we can't update the value 
		
		System.out.println(f.a);
	}	
}


