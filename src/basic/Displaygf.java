package basic;

public class Displaygf {
public void wishgf(String name)
{
	synchronized(this)
	{
		;;;;;;;;;;;;;;;;;;;;//1 lakh lines of code
		for (int i=0; i<5 ;i++)
		{
			System.out.print("good morning ......");
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e) {}
			System.out.println(name);
		}
		;;;;;;;;;;;;;;;;;;;//1 lakh lines of code
	}
}
}
