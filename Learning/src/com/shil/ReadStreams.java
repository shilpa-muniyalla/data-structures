package com.shil;

import java.io.FileInputStream;

public class ReadStreams {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("c:\\javafiles\\writecharacters.txt");
		int i =0;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		fis.close();
		
		

	}

}
