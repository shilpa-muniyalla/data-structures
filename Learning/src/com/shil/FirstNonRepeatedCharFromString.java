//print first non repeated character from string

package com.shil;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatedCharFromString {
	
	public static char findFirstNonRepeatedCharFromString(String str1) {
		
		char[] array=str1.toCharArray();
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(Character c:array) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
				}
			else {
				map.put(c,1);
			}
		}
			for(Entry<Character,Integer> entry:map.entrySet()) {
				
			if(entry.getValue()==1) {
				return entry.getKey();
			}
			}
			throw new RuntimeException("dint find any non repeated characters");
		}
			
			
			
			
		
	
	

	public static void main(String[] args) {
		System.out.println(findFirstNonRepeatedCharFromString("roro"));
		

	}

}
