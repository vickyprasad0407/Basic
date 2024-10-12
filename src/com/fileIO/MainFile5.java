package com.fileIO;

import java.io.File;

public class MainFile5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File f=new File("D:\\programs");
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getParent());
        String fname[]=f.list();
        for (String name : fname) {
			System.out.println(name);
		}
        System.out.println("============java file=========");
        for (String nm : fname) {
			if(nm.endsWith(".java"))
				System.out.println(nm);
		}
	}

}
