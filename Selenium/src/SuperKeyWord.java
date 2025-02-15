class Animal 
{
	
	String color="red";

	void eat()
	{
		System.out.println(color);
		
		System.out.println(" Etting ");
	}
}

class Dog extends Animal 
{
	String color="black";
	
	

	void eat()
	{
		System.out.println(super.color);// here we are accessing immediate class variable 
		System.out.println("Dog etting ");
		super.eat();// here we are cooling immediate class methods 
	}
	
}

public class SuperKeyWord 
{

	public static void main(String[] args) 
	{

	 Dog d =new Dog();
	 
	 d.eat();

	}

}
