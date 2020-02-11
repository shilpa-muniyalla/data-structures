//prime number using while loop

package com.shil;

public class PrimeNumberUsingWhile {
	
	public static void findPrimeNumberUsingWhile(int number) {
		int i=2;
		boolean value=false;
		while(i<number) {
			if(number%i==0) {
			value=true;
			System.out.println("is not a prime number");
			break;
		}
			i++;
	}
		if(value==false) {
			System.out.println("its a prime number");
		}
		
	}

	public static void main(String[] args) {
		findPrimeNumberUsingWhile(15);
		

	}

}
