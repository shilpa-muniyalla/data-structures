package com.shil;

public class EvenOdd {
	
	public static void findEvenOdd(int x) {
		int a=2;
		if(x%a==0) {
			System.out.println("the number is even");
		}
		else {
			System.out.println("the number is odd");
		}
	}
	
	public static void main(String[] args) {
		findEvenOdd(-1);
	}

}
