package com.java.tasks;

public class Sum {
	//Create a method that will get an array of integers,
	// and return the sum
	// Make the method protected
	
	protected int getSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        Sum nums = new Sum();
        int[] numbers = {1, 2, 3, 4, 5};
        int result = nums.getSum(numbers);
        System.out.println("The sum is: " + result);
    }
}


