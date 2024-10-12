package com.collection;

import java.util.TreeMap;

public class TreeMapDemoComparator {

	public static void main(String[] args) {

		TreeMap t=new TreeMap(new MyDemoMapComparator());
		t.put("xxx", 10);
		t.put("yyy", 20);
		t.put("zzz", 30);
		t.put("aaa", "dfgfgjf");
		t.put("llll", 40);
		System.out.println(t);
	}

}
