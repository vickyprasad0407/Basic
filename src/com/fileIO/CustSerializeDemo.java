package com.fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustSerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
        Account a1=new Account();
        System.out.println(a1.username+"....."+a1.pwd+"...."+a1.pin);
        FileOutputStream fos=new FileOutputStream("cid.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(a1);
        
        FileInputStream fis=new FileInputStream("cid.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Account a2=(Account)ois.readObject();
        System.out.println(a2.username+"...."+a2.pwd+"....."+a2.pin);
	}

}
