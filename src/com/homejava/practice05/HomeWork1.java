package com.homejava.practice05;

import java.util.Arrays;

public class HomeWork1 {

	public static void main(String[] args) {
		
		/*
		 * Create a String and print it in reverse order (Sunday → yadnuS). 
    Solve it using charAt(), toCharArray()  and reverse() methods.
    Note:
        for charAt() and toCharArray() use String
        for reverse you have to declare a StringBuffer object

		 */
		
		String day = "Sunday";
		
		// Using charAt(),
		for (int i = day.length()-1; i>=0; i--)
		{
			char ch = day.charAt(i);
			System.out.print(ch);
		}	
		System.out.println("\n" + "------------------");
		// using toCharArray();
		char[]arr = day.toCharArray();
		System.out.println(Arrays.toString(arr));
		for (int i=arr.length -1; i>=0; i--)
		{
			char ch = arr[i];
			System.out.print(ch);
		}
		System.out.println("\n" + "------------------");
		// using reverse()method
		StringBuffer day1= new StringBuffer(day);
		System.out.println(day1.reverse());
		
	}

}
