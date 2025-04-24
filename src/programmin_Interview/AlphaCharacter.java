package programmin_Interview;

public class AlphaCharacter {

	public static void main(String[] args) {
		/*
		 * Find out how many alpha characters are present in a String? Find the number
		 * of words in a string? How many letters in a String? No numbers, no special
		 * characters.
		 */
		
		String str = "dfoiuwerD ere 78hJ"; //Alpha character means only letters
		str = str.replaceAll("[^a-zA-z]", " "); //replace with space whichever is not a letter
		
		//find out the number of alpha characters.
		System.out.println("Number of alpha characters = "+ str.length());
		
		
	}

}
