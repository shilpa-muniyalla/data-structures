//sorting of array elements

package com.shil;

public class BubbleSort {
	
	public static int[] findBubbleSort(int[] array) {
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
		return array;
	}

	public static void main(String[] args) {
		
		int[] array= {45,35,25,85};
		array=findBubbleSort(array);
		for(int s:array) {
			System.out.println(s);
		}
		

	}

}
