package Typecasting;



class Animal {

}

class Cat extends Animal {

}

class Dog extends Animal {

}

public class TypeCastingObject {

	public static void main(String[] args) {
		
		/*
		 Rule 1 :- conversion is valid or not 
		 A   B      C   D
		 
		 Cat c  = (Cat) an;
		  
		 The type of cat must be have same relationship (either parent to child or child to parent )
		
		Animal an= new Dog();
		
		Cat c= (Cat)an; //valid rule 1
	
		System.out.println("Working");
		
		
		Dog d =new Dog();
		Cat c=(Cat)d;// Invalid there is no relationship we will get compile time error
				
		*/
		
/*
		//Rule:-2 Assignment is valid or not
		
		// C Must be ather child of A
		
		Animal an= new Dog();
		
		//Cat d=(Dog)an; // Invalid

	    Animal an1= new Dog();
		
		Cat c= (Cat)an; //valid rule 1 and rule 2 valid

*/

		//Rule :- 3 the underlying object type of D must be either same or child of C
		
		Animal an =new Dog();
		
		Dog dg=(Dog)an;
		
		Animal an1 =new Dog();
		//Cat c=(Cat)an1; // This is not valid rule 3
		
		
	}

}
