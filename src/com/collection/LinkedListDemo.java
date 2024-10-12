package com.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList l=new LinkedList();
		l.add("durga");
		l.add(30);
		l.add(null);
		l.add("durga");
		System.out.println(l);
	    l.set(0, "softwarwe");
	    l.add(0, "venky");
	    System.out.println(l);
	    l.removeLast();
	    l.addFirst("ccc");
	    System.out.println(l);
	      
	}

}
