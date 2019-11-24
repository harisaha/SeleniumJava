package day2.classroom.array;

public class ReverseStr {

	public static void main(String[] args) {

		// Here is the input
		String test = "feeling good";

		// Build the logic to find the count of each
		/* Pseudo Code: 1
			a) Convert the String to character array
			b) Traverse through each character (using loop in reverse direction)
			c) Print the character (without newline -> like below
			   System.out.print(ch);
		 */




		/* Pseudo Code: 2
		a) Find the length of the string
		b) Traverse through each index from length-1 -> 0 (using loop in reverse direction)
		c) Find the character of the String using its index
		 */

		char[] array = test.toCharArray();
		/*
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		 */
		for (int i = array.length-1; i > 0 ; i--) {
			System.out.print(array[i]);

		}
		System.out.println();

		int len = array.length;
		System.out.println(len);
		for (int i = array.length-1; i > 0; i--) {
			if (i==2) {
				System.out.println(array[i]);
			}
		
			
		}







	}

}
