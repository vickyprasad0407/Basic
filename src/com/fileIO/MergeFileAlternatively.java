package com.fileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeFileAlternatively {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       PrintWriter pw=new PrintWriter("File3.txt");
       BufferedReader br1=new BufferedReader(new FileReader("File1.txt"));
       BufferedReader br2=new BufferedReader(new FileReader("File2.txt"));
       String line1=br1.readLine();
       String line2=br2.readLine();
       while(line1!=null || line2!=null)
       {
    	   if(line1!=null)
    	   pw.println(line1);
    	   if(line2!=null)
    	   pw.println(line2);
    	   line1=br1.readLine();
    	   line2=br2.readLine();
       }
       pw.flush();
       br1.close();
       br2.close();pw.close();
    		   
	}

}
