package scanner.java;

import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
		
		System.out.println("Enter Name");
		
		//create Scanner object and import scanner library from Java
		Scanner obj = new Scanner(System.in);
		//string input and saved in "name" variable
		String name = obj.nextLine();
		
		System.out.println("Name is: "+name);
		
		System.out.println("-----------------------------------");
		
		System.out.println("Enter Age and Salary");
		int age = obj.nextInt(); //int input and save age in "age" variable
		
		double salary = obj.nextDouble(); 
		
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("Salary is:"+ salary);
		
		

	}

}
