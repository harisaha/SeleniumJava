package week1.assignments;

import java.util.Arrays;

public class EachCharCount {
	public static void main(String[] args) {
		String txt = "Hello".toLowerCase();
		char[] a = txt.toCharArray();
		char[] b = new char[a.length];
		int[] c = new int [a.length];
		int bIndex = 0;
		for (int i = 0; i < a.length; i++) {
			boolean letterAvail = false;
			for (int j = 0; j < bIndex; j++) {
				if(a[i]==b[j]) {
					letterAvail = true;
					c[j]+=1;
				}
			}
			if (!letterAvail) {
				b[bIndex]=a[i];
				c[bIndex]=1;
				bIndex++;
			}
		}
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
		for(int k=0;k<bIndex;k++)
			System.out.println("letter >> "+b[k]+" Count >> "+c[k]);
		/*
		for (int i = 0; i < a.length; i++) {
			if (a[i]==a[i+1]) {
				count++;
			}
		System.out.println(a[i]+" count is"+count);	
			
			}*/
			
			
			
		}
	}
	
	
	
	
	


