package Threadss;

class MyThread extends Thread {
	    public void run() {
	        System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
	    }

	    public static void main(String[] args) {
	        for (int i = 0; i < 5; i++) {
	            MyThread t = new MyThread();
	            t.start();
	        }
	    }
	}



