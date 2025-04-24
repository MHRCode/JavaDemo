package com.homejava.practice10;

public class Array {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Computer comp = new Computer();
		HP hp = new HP();
		Lenovo Len= new Lenovo();
		Dell dell = new Dell();
		
		
		
		Computer [] comps = {hp, Len, dell};
		
		for (Computer com : comps) {
			com.msOffice();
			com.battery(null, 0);
		System.out.println();
		}
		
		
		
	}

}
