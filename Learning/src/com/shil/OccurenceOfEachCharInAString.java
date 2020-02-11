//number of occurence of each character in a string using hashmap

package com.shil;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfEachCharInAString {
	
	public static void findOccurenceOfEachCharInAString(String s) {
		s.replace("\\s", "");
		char[] array=s.toCharArray();
		
		Map<Character,Integer> map =new HashMap();
		
		for(char c:array) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}
			else {
				map.put(c,1);
			}
		}
	
	
	System.out.println(s +" " +map);
	
}


	public static void main(String[] args) {
		String s="I am shilpa muniyalla";
		s.toLowerCase();
		findOccurenceOfEachCharInAString(s);
		

	}

}
