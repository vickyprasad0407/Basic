package com.fileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       PrintWriter out=new PrintWriter("abc.txt");
       out.write(100);
       out.println(100);
       out.println(true);
       out.println('c');
       out.println("durga");
       out.println("software solution");
       out.flush();
       out.close();
	}

}
