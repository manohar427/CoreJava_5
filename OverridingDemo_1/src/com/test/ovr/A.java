package com.test.ovr;

 public class A {
  
	public  void getName(){
		System.out.println(" A - getName");
	}
}
class B extends A
{
	public void getName(){
		System.out.println(" B - getName");
	}
}

class C
{
	public static void  getName(){
		System.out.println("C getName()");
	}
}

final  class D
{
	final int age =10;
	
	public int getAge(){
		//age = age +5;
		return age;
	}
	
	int getAmount(final int accNumber){//7676567
		
		//accNumber = accNumber+2387;
		return 1000;
	}
}


class X{
	final int balance = 1000;
}

class Y extends X{
	
	public int getBalance(){
	//balance = balance +10;
	return balance;
	}
}

























