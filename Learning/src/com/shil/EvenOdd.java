package com.shil;

public class EvenOdd {
	int value = 2;
	public void checkEvenOdd(int evenOddNumber) {
		if(evenOddNumber%value==0) {
			System.out.println("This is even number" +" "+evenOddNumber);
		}
		else {
			System.out.println("This is odd number" +" "+evenOddNumber);
		}
	}
	
	public static void main(String[] args) {
		EvenOdd evenOdd = new EvenOdd();
		evenOdd.checkEvenOdd(-1);
	}

}
