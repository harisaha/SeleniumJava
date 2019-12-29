package week1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// Here is the input
		String test="I am a software tester";
		String a[]=test.split(" ");
		String op="";
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				op+=a[i];
			}else{
				char[] b = a[i].toCharArray();
				String evenWord="";
				for(int j=b.length-1;j>=0;j--) {
					evenWord+= b[j];
				}
				op+=evenWord;
			}
			op+= " ";
		}
		System.out.println("op>>"+op);
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		
		/* Pseudo Code:
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		d) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		e) print the even position words in reverse order using another loop (nested loop)
		 
	*/
		System.out.println(op);
		

	}

}
