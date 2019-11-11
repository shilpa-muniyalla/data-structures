package com.shil;

public class BubbleSort {
	
	public static void checkBubbleSort(int[] a) {
		
		int n=a.length;
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				if(a[j]>a[j+1]) {
					
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
	}

	public static void main(String[] args) {
		int[] a= {50,30,10,70,65,15,26,89,44,39};
		BubbleSort.checkBubbleSort(a);

	}

}
