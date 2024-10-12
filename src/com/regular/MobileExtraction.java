package com.regular;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileExtraction {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("(0|[+]91)?[ 789][0-9 ]{2}[ 0-9]{4}[0-9]{5}|(0|[+91])?[789][0-9]{9}|(0|[+]91 )?[789][0-9]{2}[ 0-9]{4}[ 0-9]{5}");
        PrintWriter out=new PrintWriter("output.txt");
        BufferedReader br=new BufferedReader(new FileReader("input.txt"));
        String line=br.readLine();
        while(line!=null)
        {
        	Matcher m=p.matcher(line);
        	while(m.find())
        	{
        		out.println(m.group());
        	}
        	line=br.readLine();
        }
        out.flush();
        out.close();
        br.close();
	}

}
