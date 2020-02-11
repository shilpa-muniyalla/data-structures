//Search number in arraylist

package com.shil;

import java.util.ArrayList;

public class SearchNumberInArrayList {
	
	public int findSearchNumberInArrayList(int x,ArrayList<Integer> list) {
		
		for(int i=0;i<list.size();i++) {
			if(x==list.get(i)) {
				return i;
			}
		}
		
		return -1;
		}
	

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		int x=5;
		
		SearchNumberInArrayList s = new SearchNumberInArrayList();
		System.out.println("the number found at index " +s.findSearchNumberInArrayList(x, list));
		

	}

}
