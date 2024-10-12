package com.garbagecollector;

import java.util.Date;

public class RuntimeDemo {

	public static void main(String[] args) {

		Runtime r=Runtime.getRuntime();
		System.out.println(r.totalMemory()+"...total memory");
		System.out.println(r.freeMemory()+"....free memory");
		for (int i = 0; i < 1000; i++) {
			Date d=new Date();
			d=null;
		}
		System.out.println(r.freeMemory()+"......free memory after nullifying");
		r.gc();
		System.out.println(r.freeMemory()+"....free memory after gc method");
	}

}
