//factorial normal

package com.shil;

public class Fatorial {
	
	
/*	public static int findFactorial(int number) {
		int output=number;
		for(int i=number-1; i>0;i--) {
			output=i*output;
			
		}
		return output;
	}

	public static void main(String[] args) {
		
		System.out.println(findFactorial(5));

	}

}*/
	
	//recursion factorial
	public static int findFactorial(int number) {
		
		if(number>0) {
			return number*findFactorial(number-1);
		}
		else {
			return 1;
		}
	}
		
		public static void main(String[] args) {
			System.out.println(findFactorial(4));
		}
			
		}
	
