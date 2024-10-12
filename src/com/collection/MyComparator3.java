package com.collection;

import java.util.Comparator;

public class MyComparator3 implements Comparator
{
   public int compare(Object obj1,Object obj2)
   {
	   Integer I1=(Integer)obj1;
	   Integer I2=(Integer)obj2;
	   
	   //return I1.compareTo(I2);    // default natural sorting order
	   //return -I1.compareTo(I2);   // descending order
	   //return I2.compareTo(I1);      // descending order
	   //return -I2.compareTo(I1);   // ascending order
	   //return +1;                  // insertion order
	   //return -1;                    // reverse of inserion order
	   return 0;                       // only first element will be inserted
	   
   }
}
