package com.homejava.practice07;

public class HomeWork19 {

	/*
	 * Create a method that will accept a String as a parameter and return a new
	 * String that consist only of vowels. Method should be available inside the
	 * class where it was declared and executed by calling it is name.
	 */

			private static String VowelsOnly(String str) {
				
				String result = str.replaceAll("[^aeiouAEIOU]", " ");
				
				return result;
				
			}
	
	
	
	public static void main(String[] args) {

		String str = "We have no class today because it is Monday.";
		
		
		System.out.println( VowelsOnly(str));
		
		
	}

}
