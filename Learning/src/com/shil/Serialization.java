package com.shil;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws Exception {

	Employeee emp = new Employeee();
	emp.name="shilpa";
	emp.address="california";
	
	FileOutputStream fos = new FileOutputStream("c:\\javafiles\\char.txt");
	ObjectOutputStream out = new ObjectOutputStream(fos);
	out.writeObject(emp);
	out.close();
	fos.close();
	System.out.println("serialization has finished successfully");
	
	}

}
