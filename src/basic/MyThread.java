package basic;

public class MyThread extends Thread
{
public void run ()
{
	//System.out.println("run method executed by :"+Thread.currentThread().getName());
    
	for (int i = 0; i < 10; i++) {
		System.out.println("child thread");
		
	
	}
  
}
}
