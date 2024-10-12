package basic;

public class Test {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		MyThread t=new MyThread();
		System.out.println(t.getName());
		Thread.currentThread().setName("Vicky");
		System.out.println(Thread.currentThread().getName());
		t.setName("child thread");
		System.out.println(t.getName());
		//System.out.println(10/0);
		t.start();
	}

}
