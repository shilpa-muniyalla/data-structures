//writing the single bytes or single character into the file

package com.shil;

import java.io.FileOutputStream;

public class WriteByte {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("c:\\javafiles\\writestream");
			fos.write(65);
			fos.close();
			System.out.println("success");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
