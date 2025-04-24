package com.java.tasks;

public class StringSplit {

	public static void main(String[] args) {


		String words = "Today is Friday. It is sunny. Do you like it?";
		
		String []arr = words.split("[.?]");
		
		System.out.println("Number of sentences is: " + arr.length);
		
		
		for (String s : arr)
		{
			System.out.println(s);
		}
		
		
		System.out.println("----------String Replace---------------------");
		
		String str = "Hello World";
		
		String str1 = str.replace(" ","");
		
		System.out.println("Words with Space: " + str);
		System.out.println("Words with No Space: " + str1);
		
		
		
		
	}

}
