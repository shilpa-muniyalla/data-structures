//Binary search - searching the number in an sorted array by using formula and recursion
//concept-Search a sorted array by repeatedly dividing the search interval in half.

package com.shil;

public class BinarySearch {
	
	public static void findBinarySearch(int[] array,int start,int end,int x) {
		if(start<=end) {
			int mid=(start+(end-start)/2);
			
			if(x==array[mid]) {
				System.out.println("the number found at index " +mid);
				return;
			}
			
			if(x>array[mid]) {
				start=mid+1;
			}
			
			if(x<array[mid]) {
				end=mid-1;
			}
			
			findBinarySearch(array,start,end,x);
		}
			
		else {
				System.out.println("the number not found in array");
			}
		}
	
	

	public static void main(String[] args) {
		int[] array= {10,20,30,40};
		findBinarySearch(array,0,array.length-1,40);
		

	}

}
