package week3.assignment_collections;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collection {
	String comName1 = "HCL";
	String comName2 = "CTS";
	String colName3 = "Aspire Systems";
	String givenString = "Paypal India".toLowerCase();

	
public static void main(String[] args) {
	Collection col = new Collection();
	Set<String> entry = new TreeSet<>();
	entry.add(col.comName1);
	entry.add(col.comName2);
	entry.add(col.colName3);
//	System.out.println(entry);
	System.out.println(col.givenString);
	char[] result = (col.givenString).toCharArray();
	System.out.println(result);
	int num = result.length;
	Set<Character> setChar = new HashSet<>();
	List<Character> listChar = new ArrayList<>();
	for (int i = 0; i < result.length; i++) {
		listChar.add(result[i]);
		setChar.add(result[i]);
		
	}
	
	System.out.println(setChar.size());
	if (listChar.equals(setChar)) {
		System.out.println("No duplicates.");
	}else {
		System.out.println("Found a duplicates.");
	}
	String op = "";
	for (Character character : setChar) {
		if (character != ' ') {
			op+=character;
		}
	}
	System.out.println("Output is -> "+op);
}
}
