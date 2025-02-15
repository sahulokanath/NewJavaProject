package Day9;

public class Thiskeyword {

	
	int a;
	int b;
	
	
	void m1(int a ,int b)
	{
		a=a;
		b=b;
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
	

		Thiskeyword t = new Thiskeyword();
		
		

		t.m1(10, 20);
	

	}

}
