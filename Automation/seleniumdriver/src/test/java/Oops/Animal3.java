package Oops;

class Animal3 
{
    Animal3() 
    {
        System.out.println("Animal Constructor Called");
    }
}

class Dog2 extends Animal3 
{
    Dog2()
    {
        super(); // Calls the parent constructor
        System.out.println("Dog Constructor Called");
    }

    public static void main(String[] args) 
    {
        Dog2 d = new Dog2(); // Creates an object of Dog class
    }
}
