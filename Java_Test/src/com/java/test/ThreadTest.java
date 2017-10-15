package com.java.test;

import java.time.LocalTime;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadTest implements Runnable {
	static LocalTime startTime, endTime;
	static ThreadGroup tg = new ThreadGroup("ronTG");
	
	@Override
	public void run() {
		for(int x = 0; x < 10; x ++) {
			System.out.println("running thread: " + Thread.currentThread().getName() + " " + this.hashCode());
			try {
				testSync();
//				tg.wait();
				System.out.println(tg.getName());
				Thread.sleep(2000);
				Thread.currentThread().yield();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized static void testSync() {
		System.out.println("called sync test...");
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadTest tt1 = new ThreadTest();
		Thread t1 =  new Thread(tg, tt1, "tt1");
		Thread t2 =  new Thread(tg, tt1, "tt2");
		Thread t3 =  new Thread(tg, tt1, "tt3");
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		startTime = LocalTime.now();
		System.out.println("Start time: " + startTime);
//		t1.start();
//		t1.join();
//		t2.start();
//		t3.start();
		
		
//		Executor r = Executors.newCachedThreadPool();
//		r.execute(t1);
		
		Executor rFixed = Executors.newFixedThreadPool(3);
		rFixed.execute(t1);
		rFixed.execute(t2);
		rFixed.execute(t3);
	
		endTime = LocalTime.now();
		System.out.println("End time: " + endTime);
		
		t3.join();
		System.out.println("Time Diff: " + endTime.minusMinutes(startTime.getMinute()));
	}
}
