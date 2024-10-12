package basic;

public class MyRunnable implements Runnable
{
    public void run()
    {
    	 System.out.println("thread priority in run method is "+Thread.currentThread().getPriority());
    	for (int i = 0; i < 10; i++) {
			System.out.println("child Thread");
		}
    }
}
