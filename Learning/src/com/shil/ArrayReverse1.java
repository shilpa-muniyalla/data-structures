//easy method

package com.shil;

public class ArrayReverse1 {
	
	public static int[] findArrayReverse1(int[] array) {
		int[] result = new int[array.length];
		int x=0;
	for(int i=array.length-1;i>=0;i--) {
		 result[x]=array[i];
		 x++;
		
	}
	return result;
	}
	
	public static void main(String[] args) {
		
		int[] array= {1,2,3,4,5};
		array=ArrayReverse1.findArrayReverse1(array);
		for(int a:array) {
			System.out.println(a);
		}
	}

}
