// find numbers with even numbers of digits in an array 

package com.shil;

public class NumbersWithEvenNumbersOfDigits {
	
	public static int findNumbersWithEvenNumbersOfDigits(int[] array) {
		int count=0;
		for(int i=0;i<array.length;i++) {
			boolean value=findEvenDigits(array[i]);
			if(value) {
				count++;
			}
		}
		
		return count;
	}
	
	private static boolean findEvenDigits(int n) {
		int counter=0;
		while(n>0) {
			n=n/10;
			counter++;
		}
		return counter%2==0 ? true:false;
	}

	public static void main(String[] args) {
		int[] array= {1245,678,2222,90};
		int output=findNumbersWithEvenNumbersOfDigits(array);
		System.out.println(output);
	

	}

}
