package com.regular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the mail id");
       String mail=sc.next();
       Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
       Matcher m=p.matcher(mail);
       if (m.find() && m.group().equals(mail))
       {
    	   System.out.println("valid email id");
       }
       else
    	   System.out.println("invalid email id");
	}

}
