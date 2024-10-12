package basic;

public class SynchronizedDemo {

	public static void main(String[] args) {

		Display d1=new Display();
		Display d2=new Display();
		MyThread2 t1=new MyThread2(d1,"dhoni");
		MyThread2 t2=new MyThread2(d2,"yuvraj");
		t1.start();
		t2.start();
	}

}
 