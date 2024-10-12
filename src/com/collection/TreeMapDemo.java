package com.collection;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap m=new TreeMap();
		m.put(10, "zzz");
		m.put(20, "yyyy");
		m.put(30, "zzz");
		m.put(40, 106);
		m.put(50, null);
		//m.put(null, "zzz");
		System.out.println(m);
	}

}
