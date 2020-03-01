package com.shil;

public class FibonacciPractice {
	
	public static void fndFibonacciPractice(int count) {
		int num1=0;int num2=1;
		
		for(int i=0;i<count;i++) {
			System.out.println(num1);
			int sum=num1+num2;
			num1=num2;
			num2=sum;
		}
	}


	public static void main(String[] args) {
		fndFibonacciPractice(7);
	}
		

}
