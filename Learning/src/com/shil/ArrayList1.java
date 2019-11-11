package com.shil;

import java.util.*;

public class ArrayList1 {
	
	public void checkArrayList(ArrayList<Integer> arrayList,int a) {
		boolean b=false;
		for(int i=0; i<arrayList.size(); i++) {
			if(a==arrayList.get(i)) {
				System.out.println("the array search number is: " +i);
				b=true;
				
			}
		}
		if (b==false) {
			System.out.println("the number is not found in the array");
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
             arrayList.add(1);
             arrayList.add(2);
             arrayList.add(3);
             arrayList.add(4);
             arrayList.add(5);
             int a=5;
             ArrayList1 obj = new ArrayList1();
             obj.checkArrayList(arrayList,a);
             
	}

}
