package com.thread.simple;

import java.util.Date;

public class ParallelProgemEx {
	public static void main(String[] args) {
		
		System.out.println("Main Thread Name:"+Thread.currentThread().getName());
		
		System.out.println(new Date().getTime());
		//Task 1
		Task1 t1 = new Task1();
		t1.setName("Task 1");
		t1.start();
		
		System.out.println("Prio Th1 :"+t1.getPriority());
		System.out.println("Task 1 ID:"+t1.getId());
		
		//Task 2 
		Task2 t2 = new Task2();
		t2.setName("Task 2");
		t2.start();
		t2.setPriority(10);
		System.out.println("Prio Th2 :"+t2.getPriority());
		System.out.println("Task 2 ID:"+t2.getId());
		System.out.println(new Date().getTime());
	}

}

class Task1 extends Thread
{
	@Override
	public void run(){
		for(int i=0;i<=100;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//10
	}
}

class Task2 extends Thread
{
	@Override
	public void run(){
		for(int i=101;i<=200;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//10
	}
}