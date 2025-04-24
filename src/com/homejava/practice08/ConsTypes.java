package com.homejava.practice08;

public class ConsTypes {

	/*
	 * Homework 2: Write a program that will have 4 different access levels of
	 * constructors and create 3 objects of this class: 1 -inside same class; 2
	 * -from outside the class; 3 -from different class inside different package and
	 * observe result.
	 */
	
	String name;
	int age;
	int salary;
	
	ConsTypes(){ // this is a default which is accessible on package level
		System.out.println("This is a default constructor.");
	}
	public ConsTypes (String name) {// this is a public which is accessible to project level
		this.name = name;
		System.out.println("Name is: " + this.name);
	}
	protected ConsTypes(String name, int age) {//this is protected which is accessible to package level
		this.age = age;
		this.name = name;
		System.out.println("Name is: " + this.name + "\n" + "Age is: "+ this.age);
	}

	@SuppressWarnings("unused")
	private ConsTypes(int salary) {// this is private which is accessible to class level
		
		this.salary = salary;
		System.out.println("Salary is: " + this.salary);
	}
	
public static void main (String []args) {
	ConsTypes type1 = new ConsTypes("Public");
	type1.name = "public";
	
}
}
