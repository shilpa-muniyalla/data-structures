//palindrom number

package com.shil;

public class PalindromNumber {
	
	public static void findPalindromNumber(int number) {
		int sum=0;
		int temp=number;
	   while(number>0) {
		   int result=number%10;
		   sum=(sum*10)+result;
		   number=number/10;
		   
			
		}
	   
	   if(temp==sum) {
		   System.out.println("its a palindrom number");
	   }
	   else {
		   System.out.println("its not a palindrom number");  
	   }
	}

	public static void main(String[] args) {
		findPalindromNumber(1415);
	

	}

}
