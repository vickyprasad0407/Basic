package com.collection;

import java.util.TreeSet;

public class TreeSetDemo5 {

	public static void main(String[] args) {

		TreeSet t=new TreeSet(new MyComparator5());
		t.add("A");
		t.add("XX");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("ABCD");
		t.add("A");
		System.out.println(t);
		
	}

}
