package com.fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("abc.txt");
		fw.write(100);
		fw.write("urga\nsoftwaresolution");
        fw.write('\n');
        char [] ch= {'a','b','c'};
        fw.write(ch);
        fw.write('\n');
        fw.flush();
        fw.close();
	}

}
