package com.shil;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis = new FileInputStream("c:\\javafiles\\char.txt");
		ObjectInputStream in = new ObjectInputStream(fis);
		Employeee emp=(Employeee) in.readObject();
		in.close();
		fis.close();
		System.out.println(emp.name +" " +emp.address);

	}

}
