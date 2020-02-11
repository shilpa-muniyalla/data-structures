//ArrayReverse

package com.shil;

public class ArrayReverse3 {
	
	public int[] findArrayReverse3(int[] array,int x) {
		int[] result = new int[array.length];
		
		for(int i=array.length-1;i>=0;i--) {
			result[x]=array[i];
			x++;
		}
	
	return result;
	}

	public static void main(String[] args) {
		
		int[] array= {1,2,3,4,5};
		ArrayReverse3 a=new ArrayReverse3();
	   array=a.findArrayReverse3(array, 0);
	
	for(int b:array) {
	
	System.out.println(b);
	}
		
	

	}

}
