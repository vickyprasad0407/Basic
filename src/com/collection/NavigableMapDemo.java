package com.collection;

import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {

		TreeMap<String, String> t=new TreeMap<String, String>();
		t.put("b", "banana");
		t.put("c", "cat");
		t.put("a", "apple");
		t.put("d", "dog");
		t.put("g", "gun");
		System.out.println(t);
		System.out.println(t.ceilingKey("c"));
		System.out.println(t.higherKey("c"));
		System.out.println(t.floorKey("d"));
		System.out.println(t.lowerKey("d"));
		System.out.println(t.pollFirstEntry());
		System.out.println(t.pollLastEntry());
		System.out.println(t.descendingMap());
		System.out.println(t);
	}

}
