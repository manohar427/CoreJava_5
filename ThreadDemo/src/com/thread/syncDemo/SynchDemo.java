package com.thread.syncDemo;


public class SynchDemo {


	public static void main(String[] args) {
		Account acc = new Account();
		A th1 = new A(acc);
		Thread t = new Thread(th1);
		t.start();
		
		A th2 = new A(acc);
		Thread t2 = new Thread(th2);
		t2.start();

	}

}

class A implements Runnable
{
	Account acc;
	
	public A(Account acc) {
		this.acc = acc;
	}

	public void run() {
		acc.transaction();
	}
	
}

class Account{
	
	public synchronized void transaction(){
		System.out.println("Debit Amout from Acc1:"+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Credit Amout In to  Acc2:"+Thread.currentThread().getName());
	}
}