package com.homejava.practice02;

public class HomeWork03 {

	public static void main (String []args) {
		
		/*
		 * Write a program to implement following logic using
if-else if-else statement:
    if hour is less than 12 noon, greet with Good Morning
    if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
    if hour is greater than or equal to 3 pm, greet with Good Evening
		 */
		
		int hour = 20;
		
		if (hour < 12)
		{System.out.println("Good Morning");}
		if (hour < 15)
		{System.out.println("Good afternoon");}
		else
		{System.out.println("Good evening");}
	}
	
}
