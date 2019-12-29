package day2.classroom.array;

import java.util.Arrays;

public class PrintDuplicates {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data= {1,3,8,3,11,5,6,4,7,6,7};

		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Loop through each array item
		 3) If the consecutive array items are same -> then print as duplicates
		 */
		Arrays.sort(data);
		for (int i : data) {
			System.out.println(i);
		}
		
		for (int i = 0; i < data.length-1; i++) {
			
			
			if (data[i]==data[i+1]) {
				System.out.println("Number is duplicated "+data[i]);
			}else {
				System.out.println("No Duplicates");
			}
			}
		
		
		
		
		
		
		
		// Print the second largest number	
		
		
	}

}
