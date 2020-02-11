package com.shil;

public class EqualityOfTwoArrays {
	
	public static void checkEqualityOfTwoArrays(int[] array1,int[] array2) {
		
		boolean value=true;
		
		if(array1.length==array2.length) {
			for(int i=0;i<array1.length;i++) {
				if(array1[i]!=array2[i]) {
					value=false;
				}
			}
		}
		else {
			value=false;
		}
		
		if(value==true) {
			System.out.println("the arrays are equal");
		}
		else {
			System.out.println("the arrays are not equal");
		}
	}

	public static void main(String[] args) {
		
		int[] array1= {1,2,3,4};
		int[] array2= {1,2,3,4};
		checkEqualityOfTwoArrays(array1,array2);
		

	}

}
