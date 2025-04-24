package com.homejava.practice05;

import java.util.Arrays;

public class HomeWork2 {

	public static void main(String[] args) {
		/*
		 * Write a program to print out the following conversion:
    Today is Tuesday and we have a Java Class!!!  to 
    yadoT si yadseuT dna ew evah a avaJ !!!ssalC.
    You can use any other string as long as the format is correct.
		 */
		
		String stc = "Today is Tuesday and we have a Java Class!!!";
		
		//split the sentence into words
		
		String [] words = stc.split(" ");
		System.out.println(Arrays.toString(words));
		
		// reverse using StringBuffer
		for (String word : words) {
		StringBuffer stc1 = new StringBuffer(word);
		System.out.print(stc1.reverse() + " ");
		}
		
	}

}
