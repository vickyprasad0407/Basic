package com.fileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileExtractionOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("Output.txt");
		BufferedReader br1=new BufferedReader(new FileReader("input.txt"));
		String line1=br1.readLine();
		while(line1!=null)
		{
			boolean available=false;
			BufferedReader br2=new BufferedReader(new FileReader("delete.txt"));
			String line2=br2.readLine();
			while(line2!=null)
			{
				if(line1.equals(line2))
				{
			        available=true;		
					break;
				}
				line2=br2.readLine();
			}
			if(available==false)
			pw.println(line1);
			line1=br1.readLine();
			br2.close();
		}
		pw.flush();
		br1.close();
		pw.close();

	}

}
