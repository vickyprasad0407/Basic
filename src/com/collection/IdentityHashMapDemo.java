package com.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {

		HashMap m=new HashMap();
		Integer I1=new Integer(10);
		Integer I2=new Integer(10);
		m.put(I1, "pawan");
		m.put(I2, "kalyan");
		System.out.println(m);
		
		IdentityHashMap hs=new IdentityHashMap();
		hs.put(I1, "pawan");
		hs.put(I2, "kalyan");
		System.out.println(hs);
	}

}
