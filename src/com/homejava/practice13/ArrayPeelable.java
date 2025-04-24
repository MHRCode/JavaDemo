package com.homejava.practice13;

public class ArrayPeelable {

	public static void main(String[] args) {
		/*
		 * // Task 2 // Create an array of Peelable with 3 elements, one apple and two
		 * oranges // Iterate the array and execute the peel() method // Try to execute
		 * wash() method???
		 */

		Peelable[]arr = new Peelable[3];
		arr[0] = new Apple();
		arr[1] = new Orange();
		arr[2] = new Orange();
		
		for (Peelable fruit : arr) {
			fruit.peel();
			//fruits.wash();
			// wash()method will not excute because Peelable does not have wash()method.
		}
		
		
		
	}

}
