package oop.project;

public class Students  {
	
	//Students is a Class which has variables and methods

	//create instance variable
	String name;
	int rollNo;
	
	//create a method
	void stuInfo() {
		
		//code to be executed
		System.out.println("Name: "+ name);
		System.out.println("Roll No. "+ rollNo);
	}
	
	
	public static void main(String[] args) {
		
		//create object inside main method -- using reference variables 
		Students st1 = new Students();
		
		//initialize the object
		st1.name = "John";
		st1.rollNo = 10;
		st1.stuInfo();  //print student 1 information
		
		//add one more object
		Students st2 = new Students();
		st2.name = "Ray";
		st2.rollNo = 20;
		st2.stuInfo(); //print student 2 information
		
		
		
		

		
	}

}
