package com.test.enforl;

public class EnForLoopManager {
	public static void main(String[] args) {

		int all[] = {22,3,3,3,3,32323,23,3,3,3};
		
		/*for(int i=0;i<all.length;i++){
			System.out.println(all[i]);
		}*/
		
		//jdk 1.5 
		for (int i : all) {
			System.out.println(i);
		}
	}

}
