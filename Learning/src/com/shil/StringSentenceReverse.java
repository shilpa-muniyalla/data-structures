package com.shil;

public class StringSentenceReverse {
	
	public static void findStringSentenceReverse(String str) {
		String[] array=str.split("\\s");
		String space=" ";
		String result="";
		
		for(int i=array.length-1;i>=0;i--) {
			 result=space+array[i];
			 System.out.print(result);
			}
		
	}
	
	public static String stringReverse(String str) {
		String[] array=str.split("\\s");
		String space=" ";
		String result="";
		
		for(int i=0;i<array.length;i++) {
			String word=array[i];
			for(int j=word.length()-1;j>=0;j--) {
				
				result=result+word.charAt(j);
			}
			result=result+space;
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		//findStringSentenceReverse("i love java programming");
		System.out.print(stringReverse("i love java programming"));
		
	}

}
