package week1.optional.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		       //Declare a String 
				String text1 = "stop";
				//Declare another String
				String text2 = "potso";
				
				//build logic to check the given words are anagram or not
				
				/*
				 * Pseudo Code
				 * a) Check length of the strings are same then
				 * b) Convert both Strings in to characters
				 * c) Sort Both the arrays
				 * d) Check both the arrays has same value
				 * 
				 */
				if (text1.length()==text2.length()) {
					char[] a = text1.toCharArray();
					char[] b = text2.toCharArray();
					Arrays.sort(a);
					Arrays.sort(b);
					for (int i = 0; i < b.length; i++) {
						if(a[i]==b[i]) {
							System.out.println("Value a & b are matched >> value is >>"+a[i]);
						}else {
							System.out.println("Values a & b are mismatched >> value a >> "+a[i]+"value b >> "+b[i]);
					}
						
					}
						
				}else {
					System.out.println("Length of following strings are mismatched >> "+"String 1 >> "+text1+" and String 2 >> "+text2);

	}
	}

}
