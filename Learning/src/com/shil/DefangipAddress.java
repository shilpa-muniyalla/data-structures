//removing . from String and replacing with [.]

package com.shil;

public class DefangipAddress {
	
	public static String findDefangipAddress(String address) {
		String rep="";
		for(int i=0;i<address.length();i++) {
			if(address.charAt(i)=='.') {
				rep=rep+"[.]";
			}
		
		else {
			rep=rep+address.charAt(i);
		}
	}
		return rep;
	}

	public static void main(String[] args) {
		String address="1.1.1.1";
		address=findDefangipAddress(address);
		System.out.println(address);
		
	}

}
