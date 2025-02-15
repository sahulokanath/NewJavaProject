package Oops;

interface Animal1 {
    void makeSound(); // Method without body (fully abstract)
	
}

class Cat implements Animal1 {
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        Animal1 myCat = new Cat();
        myCat.makeSound();
    }
}
