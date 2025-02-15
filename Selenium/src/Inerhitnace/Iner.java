package Inerhitnace;


class A
{
	int a;
	void a() 
	{
		System.out.println(a);
	}
}

class B extends A
{
	int b;
	void b() 
	{
		System.out.println(b);
	}
}

class C extends B
{
	
	int c=100;
	void c()
	{
		System.out.println(c);
	}
}
public class Iner {

	public static void main(String[] args) {
		
		
		C obbj =new C();
		
		obbj.a=100;
		obbj.b=333;
		obbj.a();
		obbj.b();
		obbj.c();

	}

}
