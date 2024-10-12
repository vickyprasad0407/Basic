package basic;

public class ThreadDemo {
static
{
	MyThread t=new MyThread();
	t.start();	
	t.interrupt();
	//t.start();//Throws illegal state exception 
}
	public static void main(String[] args) {

		
		for (int i = 0; i < 10; i++) {
			System.out.println("main Thread");
		}
	}

}
