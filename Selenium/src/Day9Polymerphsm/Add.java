package Day9Polymerphsm;

public class Add {
	int a = 10;
	int b = 20;

	void sum() {
		System.out.println(a + b);
	}

	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(int a, double b) {
		System.out.println(a + b);
	}

	void sum(double a, int b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

}
