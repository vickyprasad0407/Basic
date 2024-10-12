package com.fileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerge {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("File3.txt");
		BufferedReader br1=new BufferedReader(new FileReader("File1.txt"));
		String line=br1.readLine();
		while(line!=null)
		{
			pw.println(line);
			line=br1.readLine();
		}
		br1=new BufferedReader(new FileReader("File2.txt"));
		line=br1.readLine();
		while(line!=null)
		{
			pw.println(line);
			line=br1.readLine();
		}
		pw.flush();
		br1.close();
		pw.close();
	}

}
