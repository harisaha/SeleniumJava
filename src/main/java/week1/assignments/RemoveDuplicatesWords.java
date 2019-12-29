package week1.assignments;

import java.util.Arrays;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// Use the declared String text as input
		String text = "We learnt java basics as part of java sessions in week1";
		// Initialise an integer variable as count
		int count = 0;
		String[] a = text.split(" ");
		String b[]=new String[a.length];
		String op="";
			/*
			 * Pseudo code 
			 * a) Split the String into array and iterate over it 
			 * b) Initialise another loop to check whether the word is there in the array 
			 * c) if it is available then increase and count by 1. 
			 * d) if the count > 1 then replace the word as "" 
			 * e) print the each word
			 */
		for (int i = 0; i < a.length; i++) {
			boolean wordAvailable=false;
			for (int j = 0; j < b.length; j++) {
				if(a[i].equals(b[j])) {
					wordAvailable=true;
					op+=" ";
				}
			}
			if( !wordAvailable ) {
				b[i]=a[i];
				op+=a[i];
			}
			op+=" ";
		}
		//System.out.println("o/p:" + Arrays.toString(b).replaceAll(",", "").replace("[", "").replaceAll("]", ""))	;
	System.out.println("op>>"+op);
	}

}
