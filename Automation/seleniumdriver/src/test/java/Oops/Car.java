package Oops;

class Car1 {
    String brand;
    int year;

    // Default Constructor
    Car1() {
        brand = "Toyota";
        year = 2024;
    }

    // Parameterized Constructor
    Car1(String carBrand, int carYear) {
        brand = carBrand;
        year = carYear;
    }

    void display() {
        System.out.println("Car: " + brand + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car1 car1 = new Car1();  // Calls default constructor
        Car1 car2 = new Car1("BMW", 2022);  // Calls parameterized constructor

        car1.display();
        car2.display();
    }
}
