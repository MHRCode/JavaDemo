package com.homejava.practice03;

public class Lesson13HW {

	public static void main(String[] args) {

		
		System.out.println("-----------TASK 1 ----------");
		//Create an array of countries: north America countries, south America countries, Europe countries, Asian countries, African countries.
		//Then print all values from that array using 2 different loops and calculate how many total countries been stored.

		String [][] Countries = {{"USA", "Canada", "Mexico"},
				{"Brazil", "Argentina", "Colombia"},
				{"Spain", "Italy", "Ireland"},
				{"India", "China", "Japan"},
				{"Nigeria", "Somalia", "South Africa"}};
		
		for (int i = 0; i < Countries.length; i++)
		{
			for (int j = 0; j < Countries[i].length; j++)
			{
				System.out.print(Countries[i][j] + " ");
			}
			System.out.println();
		}
		
			System.out.println("--------------------TASK 2 ------------------");
			//Write a java program to find the second largest number in the array? 
			//Maximum and minimum number in the array?
		int number [][] = {
				{4, 20, 72},
				{8, 23, 99}
		};
		int max = number[0][0];
		int min = number[0][0];
		int SecLarge =  number [0][0];
		
		for (int a =0; a<number.length; a++) { 
			for (int b=0; b<number[a].length; b++)
			{if (number[a][b]>max)
			{max =number[a][b]; }
			else if (number[a][b]<min)
			{min = number[a][b];
			}
			
			for (int k=0; k<number.length; k++)
				if (number[a][k] < max && number[a][k]>0)
				{SecLarge = number[a][k];
			}
			}
			}
		System.out.println("Maximum number is: " + max);
		System.out.print("Minimum number is: " + min);
		System.out.print("Second Largest number is: " + SecLarge);
			}
	
	}



