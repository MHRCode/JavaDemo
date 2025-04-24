package com.homejava.practice08;

public class Student {

	/*
	 * Homework 1: Write program as a Student class that has instance variables name
	 * and address. Create a constructor that will initialize those variables. Print
	 * name & address of given student using displayInfo method.
	 */
		
	String name, address;
	
	Student (String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	public void displayinfo()
	{
		System.out.println("Student Name is: " + this.name + "\n" + "Address is: " + this.address + "\n");
	}
	public static void main (String []args)
	{
		Student s1 = new Student ("John", "New York");
		Student s2 = new Student ("Tom", "Florida");
		
		s1.displayinfo();
	
		s2.displayinfo();
		
	}
}
