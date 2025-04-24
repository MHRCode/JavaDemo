package methods.project;

public class Calculation {
	
	//method is a collection of statements/functions to perform certain task
	
	//static method don't need an object to be called
	static void printMsg() {
		System.out.println("Welcome Java!");
	}
	
	//this is non-static message which need an object to be called
	void message() {
		System.out.println("Hello World!");
	
	}
	
	//parameterized method
	static void sum(int a, int b) {
		System.out.println("sum: " + (a + b));
	}

	public static void main(String[] args) {
		
		//call static method --as it was static so don't need an object to call it
		printMsg();
		
		//call non-static method ---need an object
		Calculation calObject = new Calculation();
		calObject.message();
		
		//call parameterized method
		sum(2, 5);
		
		
		
		
	}

}
