//Recursion in java is process in which method calls itself continously

package com.shil;

public class Recursion {
	
	public static void reducebyOne(int number) {
		if(number>=0) {
			reducebyOne(number-1);
		}
		System.out.println(number);
	}

	public static void main(String[] args) {
		reducebyOne(10);
		

	}

}
