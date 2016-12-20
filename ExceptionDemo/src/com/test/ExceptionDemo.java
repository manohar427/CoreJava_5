package com.test;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println(getAvg(1000, 10));
	}

	public static int getAvg(int sum, int total) {
		int avg = sum / total;

		try {
			avg = sum / total;
			// DB connection
			// process data
			String name = "Abc";
			System.out.println("Length:" + name.length());
			Class.forName("com.test");
			return avg;
		} 

	   catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Please provide non zero value:"
					+ e.getMessage());
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Please provide valid value for Name:"
					+ e.getMessage());
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some exception occuerd");
		}
		return avg;
	}
}
