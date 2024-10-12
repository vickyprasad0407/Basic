package com.fileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DuplicateElimination {

	public static void main(String[] args) throws IOException {
    PrintWriter pw=new PrintWriter("output.txt");
    BufferedReader br=new BufferedReader(new FileReader("input.txt"));
    String line=br.readLine();
    while(line!=null)
    {
    	boolean available=false;
    	BufferedReader br2=new BufferedReader(new FileReader("output.txt"));
    	String line2=br2.readLine();
    	while(line2!=null)
    	{
    		if(line.equals(line2))
    		{
    			available=true;
    			break;
    		}
    		line2=br2.readLine();
    	}
    	br2.close();
    	if(available==false)
    	{
    		pw.println(line);
    		pw.flush();
    	}
    	line=br.readLine();
    }
    pw.close();
    br.close();
	}

}
