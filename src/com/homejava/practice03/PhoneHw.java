package com.homejava.practice03;

public class PhoneHw {
	// Create a Class "Phone". Create 3 Objects of it: 
	//iPhone, Android, Nokia with specific  attributes and behaviors.
	
	String brand;
	String color;
	int price;
	int GbSize;
	
	void call() 
	{
		System.out.println(brand + " can make calls and text.");
	}
	
	void functions()
	{
		System.out.println(brand + " cost is: " + price);
		System.out.println(brand + " color is: " + color);
		System.out.println(brand + " GB size is: " + GbSize);
	}


	public static void main (String[]args)
	{
		PhoneHw phone1 = new PhoneHw();
		phone1.brand = "iPhone";
		phone1.color = "Black";
		phone1.price = 950;
		phone1.GbSize = 32;
		
		phone1.call();
		phone1.functions();
		
		
		
	}
}