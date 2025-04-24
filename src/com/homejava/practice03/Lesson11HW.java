package com.homejava.practice03;

public class Lesson11HW {

	public static void main(String[] args) {
		
		
		//Create an array of cars and store 6 elements into it.
		//Print all values from the array

		String [] cars = new String [6];
		cars [0] = "Toyota";
		cars[1] = "Ford";
		cars[2] = "Honda";
		cars [3] = "BMW";
		cars[4] = "Jaguar";
		cars [5] = "Lincoln";
		 
		for (int i=0; i<=5; i++)
		{System.out.println(cars[i] + " ");}
		
		System.out.println("-------------TASK 2 ---------------");
		//Create an array on integers and calculate the sum of all elements in an array.
		
		int [] nums = {4, 5, 7, 6};
		int total = nums [0] + nums [1] + nums[2] + nums[3];
		System.out.println(total);
		
		System.out.println("-------------TASK 3----------------");
		//Create an array of countries. While retrieving all values from an array print capital for each country.
		String [] countries = {"USA", "Canada", "Germany"};
		String [] capitals = {"Washington", "Ottawa", "Berlin"};
		for (int i = 0; i<capitals.length; i++)
			{System.out.println("The capital of " + countries[i] + "is " + capitals[i]);} 
		
	}

}
