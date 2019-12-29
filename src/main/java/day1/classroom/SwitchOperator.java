package day1.classroom;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)  Understand the variable initiation
	 * 2)  Switch concepts
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {
		
		// Declare 2 integer numbers
		
		int x=4;
		int y=5;
				int z;
		String temp="add";
		
		// Declare a String variable with input as operations (Tip:
		
		switch (temp) {
		case "add":
			z=x+y;
			System.out.println("value is "+z);
			
			break;
		case "sub":
			z=x-y;
			System.out.println("value is "+z);
			
			break;
		case "mul":
			z=x*y;
			System.out.println("value is "+z);
			
			break;
		case "div":
			z=x/y;
			System.out.println("value is "+z);
			
			break;

		default:
			break;
		}
		

		// Initiate switch case for operations
		
		
			// Within switch, include as case for add operation
		
		
			// Within switch, include as case for sub operation
		
		
			// Within switch, include as case for mul operation
		
		
			// Within switch, include as case for div operation
		
		
			// Within switch, include 'default' to handle other operations
		
		
		//end of switch case
		
	}

}
