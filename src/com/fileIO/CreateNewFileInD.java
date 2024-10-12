package com.fileIO;

import java.io.File;
import java.io.IOException;

public class CreateNewFileInD {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       File f=new File("D:\\xyz","abc.txt");
       f.createNewFile();
	}

}
