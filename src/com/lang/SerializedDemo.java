package com.lang;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializedDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
        Sher s1=new Sher();
        s1.i=888;
        s1.j=999;
        FileOutputStream fos=new FileOutputStream("wxy.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s1);
        System.out.println("deserialization started");
        FileInputStream fis=new FileInputStream("wxy.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Sher s2=(Sher)ois.readObject();
        System.out.println(s2.i+"....."+s2.j);
	}

}
