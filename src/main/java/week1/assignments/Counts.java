package week1.assignments;

public class Counts {
public static void main(String[] args) {
	String str = "CHANGE IS THEE END RESULT OF ALL TRUE LEARNING";
	String vowels = "aeiou";
	int vow=0;
	int con=0;
	for (char c : str.toCharArray()) {
		if (vowels.contains(String.valueOf(c))) {
			vow=vow+1;
			System.out.println(c);
		}else {
			con++;
		}
	}
	System.out.println(vow);
	}
		
}

