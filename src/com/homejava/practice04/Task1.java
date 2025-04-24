package com.homejava.practice04;

public class Task1 {

	public static void main(String[] args) {

		/*Create a String that will hold a sentence. 
		 * Write a program to get a new String without any spaces.
		 */
		
	      String sentence = "Today is Wednesday.";

	        String noSpaces = sentence.replace(" ", "");

	        System.out.println("Original sentence: " + sentence);
	        System.out.println("Sentence without spaces: " + noSpaces);
	
	}
}


