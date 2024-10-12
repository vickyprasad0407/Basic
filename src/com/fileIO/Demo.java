package com.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BufferedReader br=null;
		try(BufferedReader br=new BufferedReader(new FileReader("abc.txt")))
		{
			int i;
			while ((i=br.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
