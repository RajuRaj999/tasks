package Threadss;

public class SimpleThread extends Thread{
	public void run() {
		System.out.println("Thread is safe");
	}
	public static void main(String[] args) {
		SimpleThread s=new SimpleThread();
		s.run();
		s.start();
	}

}
