package com.enhancement.multi;

public class ThreadGroupDemo4 {

	public static void main(String[] args) {

		ThreadGroup tg=Thread.currentThread().getThreadGroup().getParent();
		Thread [] t=new Thread[tg.activeCount()];
		tg.enumerate(t);
		for (Thread thread : t) {
			System.out.println(thread.getName()+"..........."+thread.isDaemon());
		}
	}

}
