package basic;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {

		MyThread1.mt=Thread.currentThread();
		MyThread1 t=new MyThread1();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}

}
