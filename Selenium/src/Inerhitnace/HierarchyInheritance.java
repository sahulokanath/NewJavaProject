package Inerhitnace;

class Prenet
{
	void p(int n)
	{
		System.out.println(n);
	}

}


class Child1 extends Prenet 
{
	void c1(int c) 
	{
		System.out.println(c);
	}
}


class Child2 extends Prenet
{
	void c2(int b)
	{
		System.out.println(b);
	}
}

public class HierarchyInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child1  obbj1 =new Child1();
		
		obbj1.c1(100);
		obbj1.p(300);

		Child2 obbj2 =new Child2();
		
		obbj2.c2(5000);
		obbj2.p(600);
	}

}
