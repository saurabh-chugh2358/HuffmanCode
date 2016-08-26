package Chapter16;

import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		scores.put("Saurabh", 879);
		scores.put("Rohit", 345);
		scores.put("kathy", 438);
		
		System.out.println(scores);
		System.out.println(scores.get("Saurabh"));
		
		

	}
	
}
