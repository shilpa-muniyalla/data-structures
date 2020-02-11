package com.shil;

public class HashcodeEqualsTest {

	public static void main(String[] args) {
		
	/*	HashcodeAndEqualHuman abhilash =new HashcodeAndEqualHuman(1001,"abhilash");
		int value1=abhilash.hashCode();
		System.out.println(value1);
		HashcodeAndEqualHuman ashish = new HashcodeAndEqualHuman(1002,"ashish");
		int value2=ashish.hashCode();
		System.out.println(value2);
		
		String ramya = new String("ramya");
		int result3=ramya.hashCode();
		int result4=ramya.hashCode();
		int result5=ramya.hashCode();
		
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		String shilpa =new String("shilpa");
		int result1=shilpa.hashCode();
		System.out.println(result1);
		
		String str="FB";
		System.out.println(str.hashCode());
		
		String str2="Ea";
		System.out.println(str2.hashCode());*/
		
		
	/*	HashcodeAndEqualHuman abhilash =new HashcodeAndEqualHuman(1001,"abhilash");
		HashcodeAndEqualHuman ashish = new HashcodeAndEqualHuman(1002,"ashish");
		HashcodeAndEqualHuman anshuman=ashish;
		System.out.println(abhilash==ashish);
		System.out.println(anshuman==ashish);
		
		System.out.println(ashish.equals(abhilash));
		
		String str = new String("swathi");
		String str2= new String("swathi");
		System.out.println(str.equals(str2));*/
		
		HashcodeAndEqualHuman abhilash =new HashcodeAndEqualHuman(1001,"abhilash");
		HashcodeAndEqualHuman ashish = new HashcodeAndEqualHuman(1001,null);
		
		System.out.println(abhilash.equals(ashish));
		
		
		
		
		
		
		

	}

}
