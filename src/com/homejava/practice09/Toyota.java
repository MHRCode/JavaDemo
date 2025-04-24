package com.homejava.practice09;

public class Toyota extends Car{

	public static void main(String[] args) {

		
		Car car1 = new Car();
		car1.name = "Toyota";
		car1.color = "Black";
		car1.price = 40000;
		car1.year = 2020;
		
		car1.Drive();
		
		System.out.println();
		
	}

}
