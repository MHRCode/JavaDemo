package programmin_Interview;

public class FibonacciNumber {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to print the first 10 numbers of Fibonacci series.
		 * Fibonacci series: The next number is the sum of two previous numbers You have
		 * to print -> 1,1,2,3,5,8,13,21,34,55...
		 */
		
		int num1 = 1;
		int num2 = 1;
		for (int i=1; i<=10; i++) { //10 if we want to get first 10 number
			num2 = num2+num1;
			num1 = num2-num1;
			System.out.print(num1 + ",");
			
		}

	}

}
