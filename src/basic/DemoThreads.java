package basic;

public class DemoThreads {

	public static void main(String[] args) {

		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		 t.setPriority(10);
	     t.start();
	    
	     for (int i=0 ;i<10 ;i++)
	     {
	    	 System.out.println("main Thread");
	     }
	     System.out.println("thread priority is "+Thread.currentThread().getPriority());
	}

}
 