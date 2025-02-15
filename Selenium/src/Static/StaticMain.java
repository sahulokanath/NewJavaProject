package Static;

public class StaticMain {

	public static void main(String[] args) {
	
		//Static method and variable we can access with help of class name
		System.out.println(StaticDemo.a);
		StaticDemo.m2();
		
		StaticDemo staticDemo = new StaticDemo();
		
		//nonStatic method and variable we can access with help of Object
		staticDemo.m1();
		System.out.println(staticDemo.b);

	}

}
