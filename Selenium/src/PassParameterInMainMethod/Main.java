package PassParameterInMainMethod;

public class Main {

	public static void main(String[] args) {

		int length = args.length;

		System.out.println("Length of String:"+length);
		
		for(String a:args)
		{
			System.out.println(a);
		}
	}

}
