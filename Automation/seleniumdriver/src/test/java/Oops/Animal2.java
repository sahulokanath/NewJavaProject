package Oops;

class Animal2 {
    String name = "Generic Animal";
}

class Dog1 extends Animal2 {
    String name = "Bulldog";

    void display() {
        System.out.println("Child class name: " + name);
        System.out.println("Parent class name: " + super.name); // Using super to access parent variable
    }

    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.display();
    }
}
