package com.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		LinkedList l=new LinkedList();
		System.out.println(al instanceof Serializable);
		System.out.println(al instanceof Cloneable);
		System.out.println(al instanceof RandomAccess);
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
		List sl=Collections.synchronizedList(al);
		al.add("A");
		al.add(10);
		al.add("A");
		al.add(null);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(2, "M");
		al.add("N");
		System.out.println(al);
	}

}
