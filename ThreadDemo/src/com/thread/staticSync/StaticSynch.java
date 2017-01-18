package com.thread.staticSync;

public class StaticSynch {


	public static void main(String[] args) {
		
		A th1 = new A();
		Thread t = new Thread(th1);
		t.start();
		
		A th2 = new A();
		Thread t2 = new Thread(th2);
		t2.start();

	}

}

class A implements Runnable
{
	public void run() {
		Account.transaction();
	}
	
}

class Account{
	
	public static synchronized void transaction(){
		System.out.println("Debit Amout from Acc1:"+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Credit Amout In to  Acc2:"+Thread.currentThread().getName());
	}
}
