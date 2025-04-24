package oop.project;

public class MyClass {
	
	String car; //attribute
	int year; // attribute
	
	//create parameterized constructor 
	MyClass(String carName, int carYear){
		//initialize attributes
		car = carName;
		year = carYear;
		
		
	}

	public static void main(String[] args) {
		// create object
		MyClass obj = new MyClass("BMW", 2022);
		
		System.out.println(obj.car+" "+ obj.year);

	}

}
