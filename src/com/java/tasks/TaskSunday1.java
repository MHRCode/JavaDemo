package com.java.tasks;

public class TaskSunday1 {

	public static void main(String[] args) {
//		2. Create an array of integers and calculate the sum of all elements in the array
//		(use 2 different loops).
		
		int [] nums = {2, 4, 5, 6, 9};
		
		//METHOD 1
		int total = nums[0] + nums[1] + nums[2] + nums[3] + nums[4];
		System.out.println("Sum of Elements is " + total);
	
		System.out.println("-----------------------------");
		
		//Method 2 
		int sum = 0;
		for (int i=0; i<nums.length; i++)
		{sum += nums[i];
		
		}
		System.out.println("Sum of Elements i " + sum);
		
		
		System.out.println("-----------Task 2 Countries---------------");
		//Create an array of countries.
//		While retrieving all values from an array print capital for each country.
//		(use 2 different loops).
		
		
		String [] countries = { "USA", "Japan", "Canada", "Germany"};
		String [] capitals = { "Washington", "Canberra", "Ottawa", "Berlin"};
		
		
		
		
	}

}
