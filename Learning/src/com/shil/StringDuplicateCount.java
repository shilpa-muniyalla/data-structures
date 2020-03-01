package com.shil;

public class StringDuplicateCount {
	
	public static String findStringDuplicateCount(String str) {
		char[] array=str.toCharArray();
		int count=1;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<array.length-1;i++) {
			if(array[i]==array[i+1]) {
				count++;
			}
			else {
				sb.append(array[i]).append(count);
				count=1;
				
			}
			 if(i+2==array.length){
					sb.append(array[i+1]).append(count);
					
				}
			
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(findStringDuplicateCount("praveen"));
		

	}

}
