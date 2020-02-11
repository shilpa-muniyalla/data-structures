//string reverse

package com.shil;

public class StringReverse {
	
	public static void findStringReverse(String s) {
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
			
		}
		
	}

	public static void main(String[] args) {
		findStringReverse("Thank You Ramya");
	
		
	

	}

}
