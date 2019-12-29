package day1.classroom;

public class OddNumbers {
	
	/*
	 * Goal: Find the odd numbers in the specific range of numbers
	 * 
	 * Input: range of numbers (starting to end) [1 to 20]
	 * Output: Printing only odd numbers [1,3,5,7,9...,19]
	 * 
	 * Shortcuts:
	 * 1) Print : type 'syso', followed by ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 * 
	 * What are my learnings from this code?
	 * 
	 * 1) Understand the conditional operators
	 * 2) implemented the loop concepts in script
	 * 3) 
	 * 
	 */

	public static void main(String[] args) {
		
		int x = 20;
		
		for (int i = 1; i< x; i++) {
			
			if(i%2==1) {
				System.out.println("Printing only the odd numbers from 1 to 20 "+ i);
				
			}
			else {
				System.out.println("No odd numbers");
			}
			
			

			
		}
		
		

		//	Iterate from 1 to 20 (tip: using loop concept)

		//	Within loop -> check whether the integer is odd (tip: use mod operator)

		//	Within loop -> print the odd integer

	}

}
