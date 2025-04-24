package com.homejava.practice03;

public class Lesson12HW {

	public static void main(String[] args) {
		
		////----------------TASK 1 -------------
		//Create a 2D array where you will store the following values:
		//- Mr, Mrs Ms, Miss
		//-Smith, Jordan, Jackson, Obama.
		//After storing values print the following:
		//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.

		String [][] Names = {{"Mr", "Mrs", "Ms", "Miss"},
		
		{"Smith", "Jordan", "Jackson", "Obama"}};
		
		System.out.println(Names[0][0] + " " +  Names[1][3]);
		System.out.println(Names[0][1] + " " + Names[1][0]);
		System.out.println(Names[0][2] + " " + Names[1][1]);
		System.out.println(Names[0][2] + " " + Names[1][2]);
		
		System.out.println("-----------TASK 2-----------");
		//Create a 2D array that first row will contain 4 names and second row will contain grades, all Strings.
		//Then you program should print name of the students that has A and B grade
		
		String [][] Grades = { {"Obama", "Smith", "Jordan", "Jackson"}, 
				{"A", "B", "C", "D"}
		};
		System.out.println(Grades[0][0] + " Grade is: "	 + Grades[1][0]);
		System.out.println(Grades[0][1]+ "	Grade is: " 	+ Grades[1][1]);
		System.out.println(Grades[0][2]+ "	Grade is: " 	+ Grades[1][2]);
		System.out.println(Grades[0][3] + "	Grade is: " 	+ Grades[1][3]);
	}

}
