package Day9;

public class OverloadingMainMethod {

	
	void main() {
		System.out.println("hi");
	}
	
	void main(int n) {
		System.out.println(n);
	}
	
	void main(int n1 ,int n2) {
		System.out.println(n1+n2);
	}
	
	public static void main(String[] args) {
		OverloadingMainMethod v=new OverloadingMainMethod ();
		
		v.main();
		v.main(10);
		v.main(10, 30);
	}

}
