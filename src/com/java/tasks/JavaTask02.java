package com.java.tasks;

public class JavaTask02 {

	public static void main(String[] args) {

		int w, h, p, a;
		w = 5;
		h = 8;
		a = w * h;
		p = 2 * (w + h);
		
		
		System.out.println("The perimeter is" + p);
		System.out.println("Area is" + a);
		
		System.out.println("The perimeter of a rectangle with width " + w + " and height " + h
				+ " is equal to "+ p +" and the area is " + a);
		
		int radius = 5;
		int pi = 3;
		
		int area = pi * radius * radius;
		int perimeter = 2 * pi * radius;
		
		System.out.println("the area of a circle " + area);
		System.out.println("the perimeter of a circle " + perimeter);
		
		double mile = 1.0;;
		double km = 1.609344;
		
		
		System.out.println("10 Miles equeal to " + 10 * mile * km + " Kilometer");
		System.out.println("10 Kilometer equal to " + 10 * mile / km + " Miles");
	
		
		
	
		
	
	}

}
