package com.test.house;

public interface House {
public void getWindows();
public abstract void getFloor();
public void myHouse();
}

class MyHouse implements House{
	public void getFloor() {
		System.out.println("MyHouse getFloor");
	}
	public void getWindows() {
		System.out.println("MyHouse getWindows");
	}
	public void myHouse() {
		System.out.println("MyHouse myHouse");
	}
}

abstract class  MyNewHouse implements House{
	public void getFloor() {
		System.out.println("MyNewHouse getFloor");		
	}

}

class MyNewNewHouse extends MyNewHouse{
	
	public void getWindows() {
		System.out.println("MyNewNewHouse getWindows");
	}
	public void myHouse() {
		System.out.println("MyNewNewHouse myHouse");
	}
}