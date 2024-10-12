package com.regular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the mobile no");
	   String mob=sc.nextLine();
       Pattern p=Pattern.compile("(0|[+]91)?[789][0-9]{9}");
       
       Matcher m=p.matcher(mob);
       if(m.find() && m.group().equals(mob))
       {
            System.out.println("valid Mobile no");
       }
       else
    	   System.out.println("Invalid Mobile no");
	}

}
