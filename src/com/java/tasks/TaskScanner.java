package com.java.tasks;

import java.util.Scanner;

public class TaskScanner {

	public static void main(String[] args) {

	Scanner input = new Scanner (System.in);
	
	System.out.println("What is your First Name" );
	String FirstName = input.next ();
	System.out.println("What is your First Name " + FirstName);
	
	System.out.println("What is your Last Name " );
	String LastName = input.next();
	System.out.println("What is your Last Name " + LastName);
	
	
	}
	

}
