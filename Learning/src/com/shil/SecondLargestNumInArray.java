//to find the second largest number in an array

package com.shil;

public class SecondLargestNumInArray {
	
	public static int findSecondLargestNumInArray(int[] array) {
		int n=array.length;
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		return array[array.length-2];
	}

	public static void main(String[] args) {
		int[] array= {56,35,67,89};
		System.out.println(findSecondLargestNumInArray(array));
		

	}

}
