package com.collection;

import java.util.TreeMap;

public class SortedMapDemo {

	public static void main(String[] args) {

		TreeMap t=new TreeMap();
		t.put("ramesh", 10);
		t.put("suresh", 20);
		t.put("mahesh", 30);
		t.put("chamesh", 40);
		System.out.println(t);
		System.out.println(t.firstKey());
		System.out.println(t.lastKey());
		System.out.println(t.headMap("mahesh"));
		System.out.println(t.tailMap("mahesh"));
		System.out.println(t.subMap("chamesh", "suresh"));
		System.out.println(t.comparator());
	}

}
