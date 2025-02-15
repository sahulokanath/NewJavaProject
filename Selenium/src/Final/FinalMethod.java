package Final;

public class FinalMethod {

	final void m() {
		System.out.println("Final Method");
	}

	class FinalMethod1 extends FinalMethod {
//		void m() {
//			System.out.println("Normal Method ");
//		}
		void m(int a)
		{
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		
		FinalMethod1 f =new FinalMethod1();
		
		f.m();
		f.m(10);

	}

}
