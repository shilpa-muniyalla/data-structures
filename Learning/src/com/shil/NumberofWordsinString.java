//it will show how many number of words there in string

package com.shil;

public class NumberofWordsinString {
	
	public static void findNumberofWordsinString(String words) {
		String[] count=words.split("\\s");
		System.out.println(count.length);
	}

	public static void main(String[] args) {
		findNumberofWordsinString("we are in california");
		

	}

}
