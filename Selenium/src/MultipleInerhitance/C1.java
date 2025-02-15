package MultipleInerhitance;

public class C1 extends C2 implements I1, I2 {

	int a = 10;

	public void m1() {
		System.out.println(a);
	}

	public void m3() {
		System.out.println(c);
	}

	public void m4() {
		System.out.println(d);
	}
}
