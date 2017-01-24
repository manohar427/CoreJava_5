package com.thread.group;

public class ThreadGroupDemo {

	public static void main(String[] args) throws InterruptedException {

		ThreadGroup tg = new ThreadGroup("My Thread");
		
		A th1 = new A();
		Thread t1 = new Thread(tg,th1);
		t1.start();
		
		A th2 = new A();
		Thread t2 = new Thread(tg,th2);
		t2.start();
		
		Thread.sleep(5000);
		System.out.println("ACTIVE TOTAL COUNT:"+tg.activeCount());
		
		Thread.sleep(6000);
		System.out.println("ACTIVE TOTAL COUNT:"+tg.activeCount());
	}
}

class A implements  Runnable {
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B implements  Runnable {
	public void run() {
		for(int i=10;i<20;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}