//in fibonacci seriesnext number is the sum of two previous numbers.
//fibonnaci series previous numbers are 0 and 1

package com.shil;

public class Fibonacci {
	
	public static void findFibonacci(int count,int num1,int num2) {
		for(int i=0;i<count;i++) {
		System.out.println(num1);
		int sum=num1+num2;
		num1=num2;
		num2=sum;
	}
	}

	public static void main(String[] args) {
		
		findFibonacci(5,0,1);

	}

}
