package week1.optional.assignments;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		//Declare a String text with a value
		String text = "madama";
		char[] a = text.toCharArray();
		//Declare another String rev
		String rev = "";

		//Build a logic to find the given string is palindrome or not
		/*
		 * Pseudo Code
		 * a) Iterate over the String in reverse order
		 * b) Add the char into rev
		 * c) Compare text and rev, if it is same then print palindrome 
		 */
		for (int i = a.length-1; i >= 0; i--) {
			System.out.println("rev >>"+a[i]);
			rev+=a[i];
			System.out.println("rev op >> "+rev);
		}
		System.out.println(rev);
		char[] b = rev.toCharArray();
		if(Arrays.equals(a, b)) {
			String str = new String(a);
			System.out.println("Its a palindrome >> "+str);
		}else {
			System.out.println("It's not a palindrome >> "+text);
		}
	}

}
