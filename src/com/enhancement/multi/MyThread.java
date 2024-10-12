package com.enhancement.multi;

public class MyThread extends Thread
{

	public MyThread(ThreadGroup g,String name) {
      super(g,name);
	}
	public void run ()
	{
		System.out.println("Child thread");
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {}
		
	}

}
