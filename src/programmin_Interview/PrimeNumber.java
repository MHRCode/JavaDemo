package programmin_Interview;

import java.util.Scanner;

public class PrimeNumber {
	public static void main (String []args) {
		
		//Write a java program to check whether a given number is prime or not?
		//any number bigger than 0 and 1 is prime number
		//if any number is divisible by 1 and itself, it is a prime number
		// example, 2, 3, 5, 7, 13 are the prime numbers
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int count = 0;
		for (int i=1; i<=num; i++) {
			if (num%i ==0) {
				count++ ;
			}
			
		}
		
		if (count ==2) {
			System.out.println("isPrime");
		}
		else {
			
		
		System.out.println("Not Prime");
		}
		
	}

}
