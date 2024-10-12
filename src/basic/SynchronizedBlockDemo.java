package basic;

public class SynchronizedBlockDemo {

	public static void main(String[] args) {

		Displaygf d=new Displaygf();
		MyThread3 t1=new MyThread3(d,"Dhoni");
		MyThread3 t2=new MyThread3(d,"yuvraj");
		t1.start();
		t2.start();
		
	}

}
