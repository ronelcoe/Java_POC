package com.java.test;

class Calculator extends Thread {
	public long sum;
	public void run() {
		synchronized (this) {
			for(int i = 0; i < 10000; i++) {
				sum += i;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			notify();
		}
	}
}

public class ThreadWaitAndNotify {

	public static void main(String[] args) {
		Calculator thread = new Calculator();
		thread.start();
		synchronized (thread) {
			try {
				System.out.println("waiting for the thread notification: before...");
				thread.wait();
//				thread.join(1000);
				System.out.println("waiting for the thread notification: after...");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(thread.sum);
	}

}


