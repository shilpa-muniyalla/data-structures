//finding square root of number
//ex-15 the nearest square root is 3 that is 3*3=9 because 4*4 will exceed the number 15 
//because 4*4 is 16

package com.shil;

public class SquareRoot {
	
	public static int findSquareRoot(int number) {
		int result=2;
		int i;
		for(i=2;result<=number;i++) {
			result=i*i;
			
		}
		return (i-2);
		
	}

	public static void main(String[] args) {
		System.out.println(findSquareRoot(25));
	

	}

}
