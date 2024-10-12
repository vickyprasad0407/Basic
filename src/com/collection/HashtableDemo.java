package com.collection;

import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {

		Hashtable hs=new Hashtable();
		hs.put(new Temp1(0), "A");
		hs.put(new Temp1(2), "B");
		hs.put(new Temp1(6), "C");
		hs.put(new Temp1(15), "D");
		hs.put(new Temp1(23), "E");
		hs.put(new Temp1(16), "F");
		System.out.println(hs);
	}

}
