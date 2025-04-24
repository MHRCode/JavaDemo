package com.java.tasks;

import java.util.Scanner;

public class TaskClass7 {

	public static void main(String[] args) {
		
		
		
		//Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad,
		//any other grade --> Not Acceptable.
		//At the end your program should print which grade was entered by the user with explanation.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your grade:");
		char grade = scan.next().charAt(0);
		
		if (grade == 'A')
		{
			System.out.println("A-Excellent!");
		}
		else if (grade == 'B')
		{
			System.out.println("B-Good");
		}
		else if (grade == 'C')
		{
			System.out.println("C-Average");
		}
		else if (grade == 'D')
		{
			System.out.println("D-Bad");
		}
		else
		{
			System.out.println("Not Acceptable!");
		}

	}

}
