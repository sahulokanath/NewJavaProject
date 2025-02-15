package Day8;

public class ConsutorDemo {

	int x,y;
	
	ConsutorDemo() // Default Const 
	{
		x=100;
		y=200;
			
	}
	ConsutorDemo(int a, int b) // Params const
	{
		x=a;
		y=b;
	}
	
	void Mathod(int a, int b) //Method
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		
		ConsutorDemo c=new ConsutorDemo(); 
		ConsutorDemo c1=new ConsutorDemo(200,55); 
		c.Mathod(2, 5);

	}

}
