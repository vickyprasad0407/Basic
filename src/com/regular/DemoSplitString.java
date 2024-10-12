package com.regular;

public class DemoSplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="Durga Software Solution";
      String [] s1=s.split("\\s");
      for (String s2:s1)
      {
    	  System.out.println(s2);
      }
	}

}
