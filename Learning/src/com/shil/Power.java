//to calculate the power of number

package com.shil;

public class Power {
	
	public static int findPower(int number,int exponent) {
		int result=1;
		for(int i=0;i<exponent;i++) {
			result=result*number;
		}
		return result;
		
	}
	
	//calculate power using math 
	public static void findPowerUsingMath(int number,int exponent) {
		double result;
		result=Math.pow(number, exponent);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		System.out.println(findPower(3,3));
		findPowerUsingMath(2,5);
	}

}
