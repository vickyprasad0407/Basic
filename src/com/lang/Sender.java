package com.lang;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sender {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Dog2 d=new Dog2();
		FileOutputStream fos=new FileOutputStream("cde.srm");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
	}

}
