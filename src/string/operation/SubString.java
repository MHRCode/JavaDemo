package string.operation;

public class SubString {

	public static void main(String[] args) {

		String str = "WELCOME";
		
		//if we want a substring "COME"
		System.out.println(str.substring(3,7)); //separated with index numbers
		
		//if we want a substring "WEL"
		System.out.println(str.substring(0,3));
		
		
		String se = "Hello Java";
		//substring "Java"
		System.out.println(se.substring(6,10));
		
		//endsWith method
		System.out.println(se.endsWith("Java"));
		
		//equals method
		String s1 = "Java";
		String s2 = "Java";
		System.out.println("s1 equals s2: "+ s1.equals(s2));
		
		//if the value has Upper case or lower case then use equalsIgnoreCase method
		String a = "hello";
		String b = "Hello";
		System.out.println(a.equalsIgnoreCase(b));
		
		//concat method 
		System.out.println(s1.concat(s2));
		

	}

}
