package com.fileIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class MainFile4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="java is a very easy if you practice";
		try(FileOutputStream fout=new FileOutputStream("D:\\Eveningjava.txt"))
		{
			/*for(int i=0;i<st.length();i++)
			{
				fout.write(st.charAt(i));
			}
			fout.write('j');
			fout.write(100);*/
			byte [] bt=st.getBytes();
			fout.write(bt);
			fout.flush();
		}
		catch(IOException e)
		{
			System.out.println("File Closed sucessfully");
		}
		

	}

}
