package com.homejava.practice14;

public class ShapeTest {

	public static void main(String[] args) {

		Shape c1 = new Circle();
		c1.calculateArea();
		c1.calculatePerimeter();
		
		System.out.println("-------------");
		
		Shape s1 = new Square();
		s1.calculateArea();
		s1.calculatePerimeter();
		
	}

}
