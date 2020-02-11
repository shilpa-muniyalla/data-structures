//Prime number is a number that is greater than 1 and divided by 1 or itself only.

package com.shil;

public class PrimeNumber {
	
	public static void findPrimeNumber(int number) {
		boolean value=false;
	
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				 value=true;
				System.out.println("This is not a prime number");
				break;
			}
		}
		if(value==false) {
			System.out.println("this is a prime number");
		}
	}

	public static void main(String[] args) {
		findPrimeNumber(11);
		
	

	}

}
