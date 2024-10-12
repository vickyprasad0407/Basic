package com.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count=0;
        Pattern p=Pattern.compile("ab");
        Matcher m=p.matcher("abbabbba");
        while(m.find())
        {
        	++count;
        	System.out.println(m.start()+"....."+m.end()+"......"+m.group());
        }
        System.out.println("The total number of occurances "+count);
	}

}
