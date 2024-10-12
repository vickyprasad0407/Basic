package basic;

public class MyThread3 extends Thread
{

	Displaygf d;
	String name;
	public MyThread3(Displaygf d,String name) {

	this.d=d;
	this.name=name;
	}

	public void run ()
	{
		d.wishgf(name);
	}
}
