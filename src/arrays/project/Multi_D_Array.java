package arrays.project;

public class Multi_D_Array {

	public static void main(String[] args) {

		//declare and instantiate array
		
		int [][] arr = new int [3][2];  //3 rows and 2 colomns 
		
		//insert value in array
		//arr [row][col]
		
		arr[0][0] = 12; //row 0 and col 0
		arr[0][1]= 20; //row 0 and col 1
		
		arr[1][0] = 14; //row 1 and col 0
		arr[1][1] = 30; //row 1 and col 1
		
		arr[2][0] = 16; //row 2 and col 0
		arr [2][1] = 40; //row 2 and col 1
		
		//print size of rown and col
		System.out.println("No. of rows: "+ arr.length);  //no. of rows
		System.out.println("No. of col: "+arr[0].length); //no. of col
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[0].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		System.out.println("----------------------------------------");
		//enhanced for loop
		for (int []row : arr) {
			for (int col:row) {
				System.out.println(col);
			}
		}
		
	System.out.println("----------------------------");
	//alternate way to enter 2D array
	int [][] alt = {
			{12,20},
			{14,24},
			{16,32}
	};
	System.out.println("No. of rows:  "+ alt.length);
	System.out.println("No. of col: "+ alt[0].length);
	
	//enhanced loop
	for (int[]rows:alt) {
		for (int cols: rows) {
			System.out.println(cols);
		}
	}
	}

}
