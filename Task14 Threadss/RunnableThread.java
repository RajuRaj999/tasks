package Threadss;

public class RunnableThread  implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread is safe running");
		
	}
	public static void main(String[] args) {
		RunnableThread r=new RunnableThread();
		Thread t= new Thread(r);
		t.start();
	}

}
