//reading the single byte from an exsiting file

package com.shil;

import java.io.FileInputStream;

public class ReadByte {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("c:\\javafiles\\writestream");
		int i=fis.read();
		fis.close();
		System.out.println((char)i);
	}

}
