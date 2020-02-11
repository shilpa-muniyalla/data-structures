//listing all directories by using file class

package com.shil;

import java.io.File;

public class ListTheDirectory {

	public static void main(String[] args) {
		
		try {
			File file = new File("c:\\javafiles");
			String[] paths=file.list();
			for(String path:paths) {
				System.out.println(path);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
