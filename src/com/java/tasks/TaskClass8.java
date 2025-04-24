package com.java.tasks;


public class TaskClass8 {

	public static void main(String[] args) {

		//Write a program using while loop 
		//that calculates the sum of the even numbers between 0 and 10.
		
		int num = 0;
		int sum = 0;

		while (num <= 10) {
			if (num % 2 == 0) {
				sum += num;
			}
			num++;
		}
		System.out.println("sum is: " + sum);
			}
	}


