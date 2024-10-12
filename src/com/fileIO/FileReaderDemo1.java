package com.fileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("abc.txt");
		int i;
		while ((i=fr.read())!=-1)
		{
			System.out.print((char)i);
			//i=fr.read();
		}

	}

}
