package com.jdk8.funcInterface;

public class FunctionalInterfaceX {

	public static void main(String[] args) {
    /*  X ob = new X();
     int sum =  ob.add(10, 20);
     
     System.out.println(sum);*/
     
     
     Calculator calc = (a,b)->{
    	 return a+b;
    	 };
     
     int newSum = calc.add(100, 200);
     
     System.out.println(newSum);
     
	}

}

 @FunctionalInterface
interface Calculator{
	public int add(int x,int y);
	 default int diff1(){
		return 100-90;
	}
	 
	 static int diff2(){
			return 100-90;
		}
}

/*class X implements Calculator
{
	@Override
	public int add(int x, int y) {
		return x+y;
	}
}*/