package JavaWithSelenuim;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccurrenceOfString {

	

	public static void main(String[] args) {
	String  S = "Neelam Kushwaha";
	Map<Character, Integer> countstring = new HashMap<>();

	for(  char c : S.toCharArray()) {
		countstring.put(c, countstring.getOrDefault(c, 0) + 1);
	
	}
	for(Map.Entry<Character, Integer> entry : countstring.entrySet()) {
		System.out.println(entry.getKey() +" "+entry.getValue());
	}

	}

	

}
