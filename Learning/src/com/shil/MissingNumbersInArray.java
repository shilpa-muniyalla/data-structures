//to find missing numbers in array

package com.shil;

import java.util.Arrays;

public class MissingNumbersInArray {
	
	public static void findMissingNumbersInArray(int[] array) {
		Arrays.sort(array);
		int j=0;
		for(int i=1;i<=array.length+j;i++) {
			if(i!=array[i-1-j]) {
				System.out.println(i);
				j++;
			}
		}
	}

	public static void main(String[] args) {
	int[] array= {4,6,7,8,9,10,12,14};
	findMissingNumbersInArray(array);
	}

}
