package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortDemo {

	public static void main(String[] args) {

		ArrayList l=new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		System.out.println(l);
		Collections.sort(l);
		Collections.reverse(l);
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, "F"));
		System.out.println(l);
		Comparator c1=Collections.reverseOrder(new MyComparator2());
		
		Collections.sort(l, c1);
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, "Z",new MyComparator2()));
	}

}
