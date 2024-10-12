package com.fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectGraphDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Dog1 d1=new Dog1();
		FileOutputStream fos=new FileOutputStream("abc.shree");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis=new FileInputStream("abc.shree");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog1 d2=(Dog1)ois.readObject();
		System.out.println(d2.c1.r1.j);

	}

}
