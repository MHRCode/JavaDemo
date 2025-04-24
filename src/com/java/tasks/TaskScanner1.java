package com.java.tasks;

import java.util.Scanner;

public class TaskScanner1 {

	public static void main(String[] args) {


		//write a prgram that asks user to enter first and
		//then last name. at the end system should display user's full name
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter your first name");
		String firstname = input.next();
		
		System.out.println("Please enter your last name");
		String lastname = input.next();
		
		System.out.println("Your full name is  " + firstname + " " + lastname);
		
	}

}
