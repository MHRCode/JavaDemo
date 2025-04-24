package com.java.tasks;

import java.util.Scanner;

public class TaskClass10 {

	public static void main(String[] args) {
		
		
		//Ask the user to enter an integer and build the following pattern:
		
		   Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter an integer: ");
	        int n = scanner.nextInt();
	        
	        for (int i = 0; i < n; i++) {
	            // Print spaces
	            for (int j = 0; j < i; j++) {
	                System.out.print(" ");
	            }
	            
	            // Print stars
	            for (int k = 0; k < (2 * (n - i)) - 1; k++) {
	                System.out.print("*");
	            }
	            
	            System.out.println();
	        }
	        
	        
	        // Ask the user to enter an integer and build the following pattern:
	        
	        // 1- the first part, 1 to 5;
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	        // the second part, 4 to 1;
	        
	        for (int i = n - 1; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	    }
	}
	


