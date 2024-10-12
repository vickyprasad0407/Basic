package com.fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainFile6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File f=new File("D:\\programs");
        File [] fls=f.listFiles();
        for(File f1:fls)
        {
        	 if(f1.getName().endsWith(".java"))
        	 {
        		System.out.println(f1.getName()+" size "+f1.length());
        		FileInputStream fis=new FileInputStream(f1);
        		int bt;
        		while((bt=fis.read())!=-1)
        		{
        			System.out.print((char)bt);
        		}
        	 }
        }
	}

}
