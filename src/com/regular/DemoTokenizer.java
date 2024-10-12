package com.regular;

import java.util.StringTokenizer;

public class DemoTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StringTokenizer st=new StringTokenizer("19-04-2020","-");
      while(st.hasMoreTokens())
      {
    	  System.out.println(st.nextToken());
      }
	}

}
