//fizz" if the number is a multiplier of 3, return "buzz" if its multiplier of 5 
//and return "fizzbuzz" if the number is divisible by both 3 and 5. 
//If the number is not divisible by either 3 or 5 then it should just return the number itself. 

package com.shil;

public class FizBuzz {
	
	public static void findFizBuzz(int a,int b) {
		for(int i=1;i<=100;i++) {
			if(i%a==0 && i%b==0) {
				System.out.println("FizBuzz");
				}
			else if(i%a==0) {
				System.out.println("Fiz");
			}
			else if(i%b==0) {
				System.out.println("Buzz");
				
			}
			else {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		
		findFizBuzz(3,5);
		
	}

}
