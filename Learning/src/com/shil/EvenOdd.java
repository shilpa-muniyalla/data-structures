package com.shil;

public class EvenOdd {
	
	public static String findEvenOdd(int x) {
		int a=2;
		if(x%a==0) {
			return "EVEN";
		}
		else {
			return "ODD";
		}
	}
	
	public static void main(String[] args) {
		System.out.println(findEvenOdd(-1));
	}

}
