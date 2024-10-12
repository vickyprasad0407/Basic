package com.fileIO;

import java.io.File;
import java.io.IOException;

public class DemoFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("vicky123");
		f.mkdir();
		File f1=new File(f,"demo.txt");
        f1.createNewFile();
	}

}
