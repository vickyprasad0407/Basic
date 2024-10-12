package com.collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo2 {

	public static void main(String[] args) {

		PriorityQueue p=new PriorityQueue(new MyComparator2());
		p.offer("A");
		p.offer("Z");
		p.offer("L");
		p.offer("B");
		System.out.println(p);
	}

}
