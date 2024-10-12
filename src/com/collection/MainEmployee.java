package com.collection;

import java.util.TreeSet;

public class MainEmployee {

	public static void main(String[] args) {

		Employee e1=new Employee("Ramesh",101);
		Employee e2=new Employee("Suresh",102);
		Employee e3=new Employee("Ramesh",103);
		Employee e4=new Employee("Mahesh",104);
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		System.out.println(t);
		
		TreeSet t1=new TreeSet(new MyEmpComparator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		System.out.println(t1);
	}

}
