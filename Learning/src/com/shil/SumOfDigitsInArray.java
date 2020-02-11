//to add all the digits of array

package com.shil;

public class SumOfDigitsInArray {
	
	public static int findSumOfDigitsInArray(int[] array) {
		
		int result=0;
		
		for(int i=0;i<array.length;i++) {
			result=result+array[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] array= {1,2,5,3};
		int output=(findSumOfDigitsInArray(array));
		System.out.println(output);
		

	}

}
