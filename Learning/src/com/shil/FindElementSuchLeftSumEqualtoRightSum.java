package com.shil;

public class FindElementSuchLeftSumEqualtoRightSum {
	
	public static int executionFindElementSuchLeftSumEqualtoRightSum(int[] array) {
		int sum=0;int leftSum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
			}
		
		for(int j=0;j<array.length;j++) {
			sum=sum-array[j];
			
			if(leftSum==sum) {
				return j;
				
			}
			leftSum=leftSum+array[j];
			
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int[] array= {1,2,2,2,3,1,5,5};
		System.out.println(executionFindElementSuchLeftSumEqualtoRightSum(array));
		

	}

}
