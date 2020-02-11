//find the duplicate words in string by using HashMap

package com.shil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsFromStringUsingMap {
	
	public static void findDuplicateWordsFromStringUsingMap(String s) {
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
		
		Set<String> stringWords =wordCount.keySet();
		for(String output:stringWords) {
			if(wordCount.get(output)>1) {
				System.out.println(output +" " +wordCount.get(output));
				
			}
		}
		
	}

	public static void main(String[] args) {
		
		String s="hey i am hey java java i developer dude";
		findDuplicateWordsFromStringUsingMap(s);
		

	}

}
