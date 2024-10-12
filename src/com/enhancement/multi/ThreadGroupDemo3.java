package com.enhancement.multi;

public class ThreadGroupDemo3 {

	public static void main(String[] args) throws InterruptedException {

		ThreadGroup pg=new ThreadGroup("Parent group");
		ThreadGroup cg=new ThreadGroup(pg,"child group");
		MyThread t1=new MyThread(pg,"child thread 1");
		MyThread t2=new MyThread(pg,"child thread 2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		System.out.println("=================================");
		pg.list();
		System.out.println("=================================");
		Thread.sleep(10000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		System.out.println("=================================");
		pg.list();
	}

}
