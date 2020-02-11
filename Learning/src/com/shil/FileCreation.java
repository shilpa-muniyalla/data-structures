package com.shil;

import java.io.File;

public class FileCreation {

	public static void main(String[] args) {
		
		File file = new File("c:\\Directoryexam");
		if(!file.exists()) {
			if(file.mkdir()) {
			System.out.println("file successfully created");
		}
		else {
			System.out.println("file cannot be created");
		}

	}

	}
}
