package Oops;
//Parent class
class Animal {
 void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Child class (inherits from Animal)
class Dog extends Animal {
 void bark() {
     System.out.println("Dog barks");
 }
}

public class TestInheritance {
 public static void main(String[] args) {
     Dog d = new Dog();
     d.sound(); // Inherited method
     d.bark();  // Child class method
 }
}

