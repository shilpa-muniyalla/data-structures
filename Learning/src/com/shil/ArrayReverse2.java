package com.shil;

public class ArrayReverse2 {
	
	public static int[] findArrayReverse2(int[] array) {
		for(int i=0;i<array.length/2;i++) {
			int temp=array[i];
			array[i]=array[array.length-i-1];
			array[array.length-i-1]=temp;
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5};
		array=findArrayReverse2(array);
		for(int s:array) {
			System.out.println(s);
		}
		

	}

}
