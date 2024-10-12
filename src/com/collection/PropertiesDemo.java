package com.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {

		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("./vicky123/xyz.properties");
		p.load(fis);
		System.out.println(p);
		String s=p.getProperty("venki");
		System.out.println(s);
		p.setProperty("anand", "101");
		p.setProperty("nag", "8888");
        FileOutputStream fos=new FileOutputStream("./vicky123/xyz.properties");
        p.store(fos,"updated by vicky");
        fis.close();
        fos.close();
	}

}
