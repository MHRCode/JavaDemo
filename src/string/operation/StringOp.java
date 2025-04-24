package string.operation;

public class StringOp {

	public static void main(String[] args) {

		String str = "Hello Java";
		
		//use charAt method to find index of character in a string 
		System.out.println(str.charAt(3));
		
		//use length() 
		System.out.println(str.length());
		
		//use toLowerCase() to convert all characters into lower case
		System.out.println(str.toLowerCase());
		
		//use toUpperCase() to convert all characters into upper case
		System.out.println(str.toUpperCase());
		
		//replace method
		System.out.println(str.replace("Java", "Python"));
		
		
	}

}
