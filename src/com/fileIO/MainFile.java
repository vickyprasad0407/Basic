package com.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainFile {

	public static void main(String[] args) {

		FileInputStream fis=null;
		try {
			fis=new FileInputStream("C:\\Users\\Mr. Santosh\\Desktop\\github_json_body.txt");
			int bt;
			while(( bt=fis.read())!=-1)
			{
				System.out.print((char)bt);
			}
			System.out.println("Thank You");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File is not found in your System");
		}
		catch (IOException e)
		{
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
