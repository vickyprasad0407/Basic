package com.fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class CopyMultipleFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fil=new File("D:\\programs");
		FileOutputStream fout=new FileOutputStream("D:\\Mrning.txt");
		File [] fls=fil.listFiles();
		Vector<FileInputStream>vc=new Vector<FileInputStream>();
		for (File f : fls) {
			if(f.getName().endsWith(".java"))
				vc.add(new FileInputStream(f));
		}
		Enumeration e=vc.elements();
		SequenceInputStream sq=new SequenceInputStream(e);
		int bt;
		while((bt=sq.read())!=-1)
		{
			fout.write(bt);
			System.out.print((char)bt);
		}
		fout.flush();
		fout.close();
		sq.close();

	}

}
