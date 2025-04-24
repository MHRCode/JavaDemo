package com.homejava.practice04;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		/* Write a program that reads two parent's first names and if they expecting boy or girl?
    Based on the input suggests a name for a baby:
    If it is a boy get half from dad and half from mom.
    If it is a girl get half from mom and half from dad.

		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is Mom's first name?");
		String MomName = scan.next();
		System.out.println("What is Dad's first name?");
		String DadName = scan.next();
		System.out.println("Expecting a boy or girl?");
		String baby = scan.next().toLowerCase();
		
		String suggestedName = "";

        if (baby.equals("boy")) {
            suggestedName = DadName.substring(0, DadName.length() / 2) + 
                            MomName.substring(MomName.length() / 2);
        } else if (baby.equals("girl")) {
            suggestedName = MomName.substring(0, MomName.length() / 2) + 
                            DadName.substring(DadName.length() / 2);
        } else {
            System.out.println("Unknown");
            return;
        }
        System.out.println("Suggested baby name: " + suggestedName);
		
	}

}
