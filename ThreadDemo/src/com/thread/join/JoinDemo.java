package com.thread.join;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {

		A ob = new A();
		ob.start();
		ob.join();

		for (int i = 10; i < 20; i++) {
			System.out.println("Parent:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class A extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}