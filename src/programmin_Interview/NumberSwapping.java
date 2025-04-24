package programmin_Interview;

public class NumberSwapping {

	public static void main(String[] args) {
 /*
  * Question 1--- Write a program to swap 2 numbers without a temporary variable? 
  * Swap 2 strings without a temporary variable?
  */
		
		//swap with temp variable
		int a=4;
		int b=9;
		int temp = a;
		b=temp;
		a=b;
		System.out.println("a: "+ a + "\n and b: "+ b);
		System.out.println("--------------");
		//without temp variable
		int c=5;
		int d=8;
		c = d+c;
		d=c-d;
		c=c-d;
		System.out.println("c: "+ c + "\nand d: "+d);
		System.out.println("---------------------");
		
		String str1 = "Hello";
		String str2 = "World";
		str1 = str1+str2; // Hello World
		str2 = str1.substring(0, str1.length()-str2.length()); //str2=Hello
		str1 = str1.substring(str2.length());
		System.out.println("str1 = "+ str1 + "\nstr2= "+str2); //str1 = world 
		
		
	}

}
