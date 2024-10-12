package com.fileIO;

import java.io.File;

public class DisplayName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\Mr. Santosh\\Desktop\\java practice\\basic\\src\\com\\lang");
		String [] s=f.list();
		int count=0;
		for (String s1:s)
		{
			File f1=new File(f,s1);
			if (f1.isFile())
			{
			count++;
			System.out.println(s1);
			}
		}
		System.out.println("Total no. is "+count);

	}

}
