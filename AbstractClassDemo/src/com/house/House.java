package com.house;

public  abstract class House {
     
	public void getWindows(){
		System.out.println("Windows made up with glass");
	}
	public  abstract void getFloor();
}

class NewHouse extends  House{
	
	public void getWindows() {
		System.out.println("Windows made up with Wood");
	}
	public void getFloor(){
		System.out.println("Floor made up with Cement.");
	}
}