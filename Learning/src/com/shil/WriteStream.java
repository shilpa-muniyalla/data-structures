//writing the number of bytes or characters in to the file

package com.shil;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteStream {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		FileOutputStream fos =new FileOutputStream("c:\\javafiles\\writecharacters");
		
		       String s="welcome to california";
		       byte[] b=s.getBytes();
		       fos.write(b);
		       fos.close();
		       System.out.println("success");
		

	}

}
