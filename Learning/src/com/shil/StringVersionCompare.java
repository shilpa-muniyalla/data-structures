package com.shil;

public class StringVersionCompare {
	
	public static boolean findStringVersionCompare(String currentVersion,String latestVersion) {
		String[] current=currentVersion.split("\\.");
		String[] latest=latestVersion.split("\\.");
		
		for(int i=0;i<current.length;i++) {
			if(Integer.valueOf(current[i])<Integer.valueOf(latest[i])) {
				return true;
			}
		}
			
				return false;
			}
			
		
	

	public static void main(String[] args) {
		System.out.println(findStringVersionCompare("1.11.12","1.10.9"));
		
		

	}

}
