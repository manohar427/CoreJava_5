package com.test.house;

public class HouseManager {

	public static void main(String[] args) {
        
		/*House h = getMyHouse();
		h.getFloor();
		h.getWindows();*/
		
		House h = getMyNewHouse();
		h.getFloor();
		h.getWindows();
		
	}

	public static  House getMyHouse(){
		//House h = new House();
				House h = new MyHouse();
				return h;
	}
	
	public static  House getMyNewHouse(){
				House h = new MyNewNewHouse();
				return h;
	}
}
