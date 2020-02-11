package com.shil;

public class RemoveWhiteSpaceFromString {
	
	public static String findRemoveWhiteSpaceFromString(String s) {
		String[] array=s.split("\\s");
		String str="";
		for(int i=0;i<array.length;i++) {
			str=str+array[i];
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(findRemoveWhiteSpaceFromString("my name is shilpa"));
		

	}

}
