package com.shil;

public class GcdNormal {
	
	public static int findGcdNormal(int a,int b) {
		int gcd=1;
		if(a==0) {
			return b;
		}
		if(b==0) {
			return a;
		}
		if(a==b) {
			return a;
		}
		
			for(int i=1;i<=a && i<=b; i++) {
				if(a%i==0 && b%i==0) {
					gcd= i;
				}
			}
				return gcd;
		}
	

	public static void main(String[] args) {
		System.out.println(findGcdNormal(12,13));
		

	}

}
