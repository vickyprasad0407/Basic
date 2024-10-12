package com.anonymous;

public class ThreadDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Thread(new Runnable() {
        	public void run ()
        	{
        		System.out.println("child Thread 3");
        	}
        }).start();
        for (int i=0;i<10 ;i++)
        {
        	System.out.println("main Thread  ");
        }
	}

}
