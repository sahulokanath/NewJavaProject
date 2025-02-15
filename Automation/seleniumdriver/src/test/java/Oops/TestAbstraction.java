package Oops;

abstract class Vehicle {
    abstract void start(); // Abstract method (no body)
    
    void fuel() {
        System.out.println("Vehicle needs fuel");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

public class TestAbstraction {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); // Calls overridden method
        myCar.fuel();  // Calls concrete method
    }
}
