package com.fileIO;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {

	String username="Vicky";
	transient String pwd="Katrina";
	transient int pin=1234;
	private void writeObject (ObjectOutputStream os) throws IOException
	{
		os.defaultWriteObject();
		String epwd="123"+pwd;
		int epin=4444+pin;
		os.writeObject(epwd);
		os.writeInt(epin);
	}
	private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException
	{
		is.defaultReadObject();
		String epwd=(String)is.readObject();
		pin=is.readInt()-4444;
		pwd=epwd.substring(3);
	}
}
