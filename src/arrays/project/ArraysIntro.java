package arrays.project;

public class ArraysIntro {

	public static void main(String[] args) {
		//array is used to store multiple values of same type of data variable

		//declare and instantiate arrays
		
		int [] students = new int[5];
		
		//insert values in array
		//arrays starts with index 0 zero
		students[0]= 10;
		students[1]=11;
		students[2]=12;
		students[3]=13;
		students[4]=14;
		
		//print size of an array
		System.out.println("size of array: "+ students.length);
		
		//print values of an element in array
		System.out.println("value of element in array: "+ students[4]);
		
		//print all values of array
		for (int i=0; i<students.length; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("---------------------------------");
		
		//use for loop /enhanced loop
		for (int i:students) {
			System.out.println(i);
		}
		
		
	}

}
