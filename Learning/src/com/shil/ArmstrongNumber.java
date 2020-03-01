// it removes last number for divide : 153/10 =15,1
// it gives last number for modulus : 153%10 =3,5,1 

package com.shil;

public class ArmstrongNumber {
	
	public static int findCount(int number) {
		int count=0;
		while(number!=0) {
			count++;
			number=number/10;
		}
		return count;
	}
	
	public static int findPower(int number,int exponent) {
		int result=1;
		for(int i=0;i<exponent;i++) {
			result=result*number;
			}
		return result;
	}
	
	public static int findArmstrongNumber(int number) {
		int output=number;
		int result=0;
		int count=findCount(number);
		while(number!=0) {
			int lastDigit=number%10;
			int power=findPower(lastDigit,count);
			result=power+result;
			number=number/10;
		}
		if(output==result) {
		return 1;
		}
	
		return -1;
	}
	

	public static void main(String[] args) {
		System.out.println(findArmstrongNumber(407));
		

	}

}
