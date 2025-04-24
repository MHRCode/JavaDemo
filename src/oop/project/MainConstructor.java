package oop.project;

public class MainConstructor {
	
	int x; //attribute of the class
	
	//create constructor
	MainConstructor()
	{
		//initialize object
		
		x=10; //initialize value of the attribute
	}
	
	
	
	public static void main(String[]args) {
		
		MainConstructor mainC = new MainConstructor(); //this object will call the constructor
		System.out.println(mainC.x);
		
		
		
		
	}

}
