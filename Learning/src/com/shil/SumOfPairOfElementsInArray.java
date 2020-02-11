//adding two element in array whose sum should be equal to given number

package com.shil;

public class SumOfPairOfElementsInArray {

	public static void findSumOfPairOfElementsInArray(int[] array,int sum) {
		
		boolean value=false;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]+array[j]==sum) {
					System.out.println(array[i] +","+array[j]);
					value=true;
				}
			}
		}
		if(value==false) {
		System.out.println("pair not found in the given array");
	}
	}
	public static void main(String[] args) {
		int[] array= {23,4,15,14,1,2};
		findSumOfPairOfElementsInArray(array,16);
		
	}

}
