package com.shil;

public class LeapYear {
	
	public static boolean findLeapYear(int year) {
		int leapYear=4;
		if(year%leapYear==0) {
			System.out.println("this is a leap year");
			return true;
		}
		else {
			System.out.println("this is not a leap year");
			return false;
			
		}
	}

	public static void main(String[] args) {
		findLeapYear(2020);
		
		

	}

}
