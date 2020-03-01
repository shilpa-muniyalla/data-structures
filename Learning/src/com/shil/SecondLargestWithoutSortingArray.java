package com.shil;

public class SecondLargestWithoutSortingArray {
	
	public static int findSecondLargestWithoutSortingArray(int[] array) {
		
		int first=array[0];
		int second=0;
		
		for(int i=1;i<array.length;i++) {
			if(first<array[i]) {
				second=first;
				first=array[i];
			}
			else if(second<first && second<array[i]) {
				second=array[i];
			}
			
		}
		
		return second;
	}

	public static void main(String[] args) {
		int[] array= {8,4,3,9,5,10};
		System.out.println(findSecondLargestWithoutSortingArray(array));
	

	}

}
