package com.lang;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriInhiDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Tiger t=new Tiger();
		System.out.println(t.i+"....."+t.j);
		FileOutputStream fos=new FileOutputStream("xyz.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(t);
		
		FileInputStream fis=new FileInputStream("xyz.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Tiger t2=(Tiger)ois.readObject();
		System.out.println(t2.i+"....."+t2.j);

	}

}
