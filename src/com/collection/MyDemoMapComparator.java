package com.collection;

import java.util.Comparator;

public class MyDemoMapComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
       String s1=(String)o1;
       String s2=o2.toString();
       
		return s2.compareTo(s1);
	}

}
