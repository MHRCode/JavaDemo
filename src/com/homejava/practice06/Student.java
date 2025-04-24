package com.homejava.practice06;

public class Student {

	/*
	 * Create a Class called Students ▪ Create three variables studentName,
	 * studentID and numberOfStudents (should be a static variable) ▪ Create three
	 * objects of the Students Class ▪ Set the value for studentName, studentID and
	 * increment the numberOfStudents for each object ▪ Print out total the number
	 * of students
	 */
	
			String sName;
			int 	sID;
			static int 	StNumber;
			
			void totalStudents () {
				if (StNumber < sID)
				{ 
					StNumber++;
				}
				System.out.println("Total Number of Students: " + StNumber);
			}
			
			
	
}
