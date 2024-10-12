package com.lang;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizableDemo implements Externalizable {

	String s;
	int i;
	int j;
	public ExternalizableDemo()
	{
		System.out.println("no arg constructor");
	}
	public ExternalizableDemo(String s,int i,int j)
	{
		this.s=s;
		this.i=i;
		this.j=j;
	}
	public void writeExternal(ObjectOutput os) throws IOException
	{
		os.writeObject(s);
		os.writeInt(i);
	}
	public void readExternal(ObjectInput in) throws ClassNotFoundException, IOException
	{
		s=(String)in.readObject();
		i=in.readInt();
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ExternalizableDemo d=new ExternalizableDemo("vicky",10,20);
		FileOutputStream fos=new FileOutputStream("efg.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		FileInputStream fis=new FileInputStream("efg.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ExternalizableDemo t2=(ExternalizableDemo)ois.readObject();
		System.out.println(t2.s+"......"+t2.i+"....."+t2.j);
	}
}


