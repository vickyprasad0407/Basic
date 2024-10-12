package com.enhancement.multi;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread2 extends Thread
{
static ReentrantLock l=new ReentrantLock();

	public MyThread2(String name) {
     super(name);
	}
	public void run()
	{
		if (l.tryLock())
		{
			System.out.println(Thread.currentThread().getName()+".........got lock and perform safe operation");
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {}
			l.unlock();
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+".....unable to get the lock and perform safe operation");
		}
	}

}
