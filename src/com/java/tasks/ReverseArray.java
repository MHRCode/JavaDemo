package com.java.tasks;

public class ReverseArray {

	public static void main(String[] args) {

		int [] Num1 = new int [] {1,2,3,4,5};
		
		for (int i=0; i<Num1.length; i++) {
			System.out.print(Num1[i] + " ");
		}
		System.out.println();
		
		for (int i=Num1.length-1; i>=0; i--)
		{
			System.out.print(Num1[i] + " ");
		}
		System.out.println();
	}

}
