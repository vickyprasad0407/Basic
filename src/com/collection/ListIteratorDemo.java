package com.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		LinkedList l=new LinkedList();
		l.add("balakrishna");
		l.add("venki");
		l.add("chiru");
		l.add("nag");
		System.out.println(l);
		ListIterator itr=l.listIterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			if(s.equals("venki"))
			{
				itr.remove();
			}
			else if (s.equals("nag"))
			{
				itr.add("charu");
			}
			else if (s.equals("chiru"))
			{
				itr.set("charan");
			}
		}
		System.out.println(l);
	}

}
