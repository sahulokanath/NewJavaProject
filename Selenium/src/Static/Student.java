package Static;

public class Student {

	int roll;
	String name;
	static String clg = "ITV";

	void dis() {
		System.out.println(roll + name + clg);
	}

	public static void main(String[] args) {

		Student s=new  Student();
		
		s.roll=10;
		s.name="lock";
		s.dis();
		
		s.roll=210;
		s.name="Ram";
		s.dis();
	}
}
