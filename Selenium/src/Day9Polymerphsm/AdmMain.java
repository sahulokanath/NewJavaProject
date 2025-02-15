package Day9Polymerphsm;

public class AdmMain {

	public static void main(String[] args) {

		Add obj = new Add();

		obj.sum();
		obj.sum(10.5, 20);
		obj.sum(20, 60.5);
		obj.sum(10, 30);
		obj.sum(10, 20, 30);
	}

}
