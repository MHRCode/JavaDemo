package com.homejava.practice10;

public class Computer {

	String os, color;
	int price, year;
	
	public void msOffice()
	{
		System.out.println("it has Microsoft Office.");
	}
	
	public void battery(String os, int year)
	{
		System.out.println("Its battery lasts for 6 hours on a single charge.");
	}
	
}

class HP extends Computer { /// subclass HP
	public void battery(String os, int year) { // this is overriding method// using same method as parent class
		System.out.println("its battery lasts for 10 hours. ");
	}
	public void Gb() { // this is specific method belong to HP class(subclass)
		System.out.println("It has a 500GB hard drive.");
	
	}
}
class Apple extends Computer {// subclass Apple
	public void msOffice(int year) { // method overloading 
		System.out.println("It has 2024 MS Office."); 
	}
}

class Dell extends Computer { // method overriding 
	public void msOffice() {
		System.out.println("it has Microsoft Office with AI features");
	}
}

class Lenovo extends Computer {
	public void turnsOn() {
		System.out.println("It turns on.");
	}
}