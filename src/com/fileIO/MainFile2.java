package com.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainFile2 {

	public static void main(String[] args) {

		FileInputStream fis=null;
		try {
			fis=new FileInputStream("C:\\Users\\Mr. Santosh\\Desktop\\vicky.txt");
			int count=1,bt;
			while((bt=fis.read ())!=-1)
			{
				if(bt=='\n')
					count++;
			}
			System.out.println("the no of lines are "+count);
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found exception");
		}
		catch (IOException e) {
			System.out.println("unable to read the file");
		}
		finally {
			try {
				fis.close();
			}
			catch(IOException e)
			{
				System.out.println("unable to close the file");
			}
		}
		
		
	}

}
