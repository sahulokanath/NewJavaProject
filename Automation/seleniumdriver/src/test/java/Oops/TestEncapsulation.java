package Oops;

class Employee {
    private String name;  // Private variable (hidden data)

    // Getter method to access private data
    public String getName() {
        return name;
    }

    // Setter method to modify private data
    public void setName(String name) {
        this.name = name;
    }
}

public class TestEncapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("John");  // Setting value
        System.out.println(emp.getName()); // Getting value
    }
}
