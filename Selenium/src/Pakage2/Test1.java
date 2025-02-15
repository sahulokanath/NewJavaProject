package Pakage2;

import Pakage1.Test2;

public class Test1 extends Test2 {

	public static void main(String[] args) {
		
		
		/*
		Test2 t= new Test2();
		t.m();
		System.out.println(t.n);
		
		// Default variable and method we can't access outside of the package 

         
        */
		
		Test1 t=new Test1();
		t.m();
		System.out.println(t.n);
		
		//protected we can access outside of the class but we have to extends the class We have to crate the object of child class
	}

}
