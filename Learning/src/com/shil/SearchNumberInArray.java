//search number in array

package com.shil;

public class SearchNumberInArray {
	
	public int findSearchNumberInArray(int[] array,int x) {
		
		for(int i=0;i<array.length;i++) {
			if(x==array[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[] array= {1,2,3,4};
		int x =0;
		SearchNumberInArray s = new SearchNumberInArray();
		System.out.println("the number found at index " +s.findSearchNumberInArray(array, x));
		
		

	}

}
