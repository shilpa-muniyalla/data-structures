//twosum using set

package com.shil;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {
	
	public static void findTwoSum(int[] array,int number) {
		int i;
		boolean value=false;
	Set<Integer> set=new HashSet<>();
	
	for(i=0;i<array.length;i++) {
		int result=number-array[i];
		if(set.contains(result)) {
			value=true;
			System.out.println(result +","+array[i]);
		}
		else {
			set.add(array[i]);
		}
	}
	if(value==false) {
	System.out.println("number does not exit");
	}
	}
	public static void main(String[] args) {
		int[] array= {1,5,4,7,8};
		findTwoSum(array,10);
		

	}

}
