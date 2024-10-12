package com.enhancement.multi;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread3 extends Thread
{
static ReentrantLock l=new ReentrantLock();
	public MyThread3(String name) 
	{
        super(name);
	}
	
	public void run ()
	{
		do 
		{
		    try {
		    	if (l.tryLock(5000, TimeUnit.MILLISECONDS))
		    	{
		    		System.out.println(Thread.currentThread().getName()+"...got the lock");
		    	
		    	Thread.sleep(30000);
		    	l.unlock();
		    	System.out.println(Thread.currentThread().getName()+".....releases the lock");
		    	break;
		    	}
		    	else
		    	{
		    		System.out.println(Thread.currentThread().getName()+".....unable to get the lock and will try again");
		    	}
		    }
		    catch(InterruptedException e) {}
		}while(true);
	}

}
