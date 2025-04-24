package com.homejava.practice03;

public class DogHw {
	
	// Create a Dog Class and create 3 different objects of it:
	//Husky, Bulldog, Labrador  with specific  attributes and behaviors.
	
	String breed;
	String color;
	int age;
	
	void eat()
	{System.out.println(breed + " can eat food.");}
	
	void run()
	{System.out.println(breed + " can run.");}
	
	void jump()
	{System.out.println(breed + " can make jumps.");}
	
	
	public static void main (String[]args)
	{
		DogHw dog1 = new DogHw();
		dog1.age = 5;
		dog1.color = "white";
		dog1.breed = "Husky";
		
		dog1.eat();
		dog1.run();
		dog1.jump();
		
	}

}
