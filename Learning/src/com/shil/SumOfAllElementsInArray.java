//sum of all elements in array

package com.shil;

public class SumOfAllElementsInArray {
	
	public static int findSumOfAllElementsInArray(int[] array) {
		int result =0;
		for(int i=0;i<array.length;i++) {
			result=result+array[i];
		}
		return result;
	}

	public static void main(String[] args) {
		
		int[] array= {1,2,3,3};
		System.out.println(findSumOfAllElementsInArray(array));
		
	}

}
