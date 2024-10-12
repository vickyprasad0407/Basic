package com.fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainCopy {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
        try(FileInputStream fis=new FileInputStream("D:\\Eveningjava.txt");FileOutputStream fout=new FileOutputStream("D:\\Morningjava.txt"))
        {
        	/*int bt;
        	while((bt=fis.read())!=-1)
        	{
        		System.out.print((char)bt);
        		fout.write(bt);
        		Thread.sleep(500);
        	}*/
        	byte [] b=new byte[fis.available()];
        	fis.read(b);
        	fout.write(b);
        	Thread.sleep(500);
        	fout.flush();
        }
        catch(IOException|InterruptedException e)
        {
        	System.out.println("File closed automatically by implementing auto closeable interface");
        }
	}

}
