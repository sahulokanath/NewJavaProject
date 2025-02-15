package MethodOverRiding;

class Loan {
	double emi() {
		return 0;
	}

	void offer(double a) {
		System.out.println(a);
	}
}

class HomeLoan extends Loan {
	double emi() {
		return 10.8;

	}

	void offer(double a) {

		System.out.println(a);
	}
}

class PresinalLoan extends Loan {
	double emi() {
		return 13.5;
	}

	void offer(double a, double b) {

		System.out.println(a * b);
	}
}

public class OverRadingVsOverLoading {

	public static void main(String[] args) {

		Loan l = new Loan();

		System.out.println(l.emi());

		l.offer(50);

		HomeLoan h = new HomeLoan();

		System.out.println(h.emi()); // Overriding

		h.offer(50.6);// Overloading

		PresinalLoan p = new PresinalLoan();

		System.out.println(p.emi());
		p.offer(2.3, 7.5);

	}

}
