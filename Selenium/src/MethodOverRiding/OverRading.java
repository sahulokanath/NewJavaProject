package MethodOverRiding;

class Bank {
	double roi() {
		return 0;
	}
}

class Sbi extends Bank {
	double roi() {
		return 10.5;
	}
}

class Icici extends Bank {
	double roi() {
		return 30.8;
	}
}

public class OverRading {

	public static void main(String[] args) {

		Bank b = new Bank();
		System.out.println(b.roi());

		Sbi s = new Sbi();
		System.out.println(s.roi()); // When we call roi method it's overrding to roi method of bank class

		Icici c = new Icici();
		System.out.println(c.roi()); // When we call roi method it's overrding to roi method of bank class

	}

}
