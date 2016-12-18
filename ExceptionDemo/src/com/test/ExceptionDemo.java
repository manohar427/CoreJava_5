package com.test;

public class ExceptionDemo {

	public static void main(String[] args) {

	}

	public static int getAvg(int sum, int total) {
		int avg = sum / total;
		System.out.println(getAvg(1000, 10));

		try {
			avg = sum / total;
			// DB connection
			// process data
			String name = null;
			System.out.println("Length:" + name.length());
			return avg;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some exception occuerd");
			return avg;
		}

	/*	catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Please provide non zero value:"
					+ e.getMessage());
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Please provide valid value for Name:"
					+ e.getMessage());
		}*/

	}
}
