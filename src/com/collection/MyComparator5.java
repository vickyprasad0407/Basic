package com.collection;

import java.util.Comparator;

public class MyComparator5 implements Comparator
{
   public int compare(Object obj1,Object obj2)
   {
	   String s1=obj1.toString();
	   String s2=obj2.toString();
	   //return s1.compareTo(s2);
	   int l1=s1.length();
	   int l2=s2.length();
	   if(l1<l2)
		   return -1;
	   else if (l1>l2)
		   return +1;
	   else 
		   return s1.compareTo(s2);
   }
}
