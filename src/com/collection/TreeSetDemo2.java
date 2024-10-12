package com.collection;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {

		TreeSet t=new TreeSet(new MyComparator2());
		t.add("Roja");
		t.add("ShobhaRani");
		t.add("RajaKumari");
		t.add("GangaBhavani");
		t.add("RamuLama");
		System.out.println(t);
	}

}
