package Day8;

public class Student {

	int sid;
	String sname;
	char grt;
	
	void printStudentdat() {
		System.out.println(sid +""+sname+""+grt);
	}

	void setStudentData(int id  , String  name ,char rt)
	{
		sid=id;
		sname=name;
		grt=rt;
	}
	
	Student(int id  , String  name ,char rt)
	{
		sid=id;
		sname=name;
		grt=rt;
	}

}
