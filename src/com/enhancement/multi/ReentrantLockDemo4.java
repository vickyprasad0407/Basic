package com.enhancement.multi;

public class ReentrantLockDemo4 {

	public static void main(String[] args) {

		MyThread3 t1=new MyThread3("First thread");
		MyThread3 t2=new MyThread3("Second Thread");
		t1.start();
		t2.start();
	}

}
