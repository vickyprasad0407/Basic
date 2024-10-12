package com.anonymous;

public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Runnable r=new Runnable()
    		   {
    	         public void run()
    	         {
    	        	 System.out.println("child Thread 2");
    	         }
    		   };
      Thread t=new Thread(r);
      t.run();
      for (int i=0;i<10;i++)
      {
    	  System.out.println("main thread 2");
      }
	}

}
