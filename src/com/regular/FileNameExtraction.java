package com.regular;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNameExtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file extension");
		String st=sc.next();
		int count=0;
		Pattern p=Pattern.compile("[0-9a-zA-Z_.$]+[.]"+st+"");
		File f=new File("C:\\Users\\Mr. Santosh\\Desktop\\java practice\\basic");
        String [] s=f.list();
        for(String file:s)
        {
        	Matcher m=p.matcher(file);
        	if (m.find() && m.group().contentEquals(file))
        	{
        		count++;
        		System.out.println(file);
        	}
        }
	}

}
