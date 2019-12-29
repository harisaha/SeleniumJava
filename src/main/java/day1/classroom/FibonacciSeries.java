package day1.classroom;

public class FibonacciSeries {
	
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8
	 * output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// initialize 3 int variables (Tip: range & firstNum, secNum in the series)
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		// Iterate from 1 to the range
		for (int i=1;i<=range;++i)
		{
			System.out.println("Value of first number is "+firstNum);
			int sum = firstNum+secNum;
			firstNum = secNum;
			secNum = sum;
		}
			// Print first number 
			
			// add first and second number
			
			// Assign second number to the first number
			
			// Assign sum to the second number
			
		

	}

}
