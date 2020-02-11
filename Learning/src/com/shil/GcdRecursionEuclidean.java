//Euclidean gcd with recursion

package com.shil;

public class GcdRecursionEuclidean {
	
	public static int findGcdRecursionEuclidean(int a,int b) {
		if(a==0) {
			return b;
		}
		if(b==0) {
			return a;
		}
		if(a==b) {
			return a;
		}
		if(a>b) {
			return findGcdRecursionEuclidean(a-b,b);
		}
		else {
			return findGcdRecursionEuclidean(a,b-a);
		}
		}
	
	public static int gcdWhile(int a,int b) {
		while(a!=b) {
			if(a>b) {
				a=a-b;
			}
			if(b>a) {
				b=b-a;
			}
		}
	
		return a;
	}
	

	public static void main(String[] args) {
		System.out.println(findGcdRecursionEuclidean(14,18));
		System.out.println(gcdWhile(50,75));
		

	}

}
