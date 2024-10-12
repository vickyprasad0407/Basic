package com.lang;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Receiver {
	static int i=1000;

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub

		System.out.println(i+2000);
		FileInputStream fis=new FileInputStream("cde.srm");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog2 d=(Dog2)ois.readObject();
		System.out.println(d.i+"......"+d.j);
				
	}

}
