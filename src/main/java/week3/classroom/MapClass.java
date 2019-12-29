package week3.classroom;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapClass {
public static void main(String[] args) {
	String name = "Testleaf".toLowerCase();
	
	char[] a = name.toCharArray();
	Map<Character,Integer> entry = new LinkedHashMap<>();
	
	for (int i = 0; i < a.length; i++) {
		if(entry.containsKey(a[i])){
			entry.put(a[i], entry.get(a[i])+1);
			
		}
		else {
			entry.put(a[i], 1);
		} 
		}
	System.out.println("Map entries are : "+entry);
	
	for (Entry<Character, Integer> op : entry.entrySet()) {
		System.out.println("Key : "+op.getKey()+" Value : "+op.getValue());
	}
	
}
}

