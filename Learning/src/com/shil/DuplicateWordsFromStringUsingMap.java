//find the duplicate words in string by using HashMap

package com.shil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsFromStringUsingMap {
	
	public static Map<String,Integer> findDuplicateWordsFromStringUsingMap(String s) {
		
		String[] words=s.split("\\s");
		
		
		Map<String,Integer> wordCount = new HashMap<>();
		for(String word:words) {
			if(wordCount.containsKey(word)) {
				wordCount.put(word.toLowerCase(), wordCount.get(word)+1);
			} 
			else
			{
				wordCount.put(word, 1);
			}
		}
		
		
		
		return wordCount;
		
		
	}
	

	public static void main(String[] args) {
		
		String s="my java java";
		
		Map<String,Integer> map =findDuplicateWordsFromStringUsingMap(s);
		
		Set<String> stringWords =map.keySet();
		for(String output:stringWords) {
			if(map.get(output)>1) {
				System.out.println(output +" " +map.get(output));
				
			}
		}
		

	}

}
