//find even numbers of digits in each number of array 

package com.shil;

public class EvenOddInArray {
	
	public static void checkEvenOddInArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			int number=array[i];
		int length=	String.valueOf(number).length();
		if(length%2==0) {
			System.out.println(number +" is even");
		}
		else {
			System.out.println(number +" is odd");
			
		}
			
		}
	}

	public static void main(String[] args) {
		int[] array= {1245,367,68,992};
		checkEvenOddInArray(array);
		
		

	}

}
