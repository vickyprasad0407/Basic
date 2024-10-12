package com.fileIO;

import java.io.FileInputStream;
import java.io.IOException;

public class MainFile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("C:\\Users\\Mr. Santosh\\Desktop\\vicky.txt");
			byte [] b=new byte[fis.available()];
			fis.read(b);
			String s=new String(b);
			System.out.println(s);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally {
			try {
				fis.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}

	}

}
