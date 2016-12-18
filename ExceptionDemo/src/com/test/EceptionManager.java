package com.test;

public class EceptionManager {

	public static void main(String[] args) {

		int avg = 0;
		try {
			avg = 1000 / 10;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Please provide Non 0 value:" + e.getMessage());
		}
		System.out.println("Avg:" + avg);
	}

}
