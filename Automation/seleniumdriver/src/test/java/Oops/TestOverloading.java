package Oops;

class MathOperations {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}

public class TestOverloading {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        System.out.println(obj.add(5, 10));   // Calls int version
        System.out.println(obj.add(5.5, 2.5)); // Calls double version
    }
}
