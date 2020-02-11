//palindrom word is word which is same after reverse

package com.shil;

public class Palindrom {
	
	public static void findPalindrom(String word) {
		
		if(word==null) {
			System.out.println("input is null");
		}
		else {
		
		StringBuilder stringBuilder =new StringBuilder();
		for(int i=word.length()-1;i>=0;i--) {
			stringBuilder.append(word.charAt(i));
		}
		
		
		String reverse=stringBuilder.toString();
		if(word.equals(reverse)) {
			System.out.println("this is a palindrom");
		}
		else {
			System.out.println("its not palindrom");
		}
	}
	}

	public static void main(String[] args) {
		findPalindrom("shilpa");
		

	}

}
