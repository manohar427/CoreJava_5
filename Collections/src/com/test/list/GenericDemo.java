package com.test.list;

import java.util.ArrayList;

public class GenericDemo {

	public static void main(String[] args) {

		// In JDK 5 Generic was introduced .. by adding Specific data type like
		// String
		// Collection will take only that data type values.
		ArrayList<String> al = new ArrayList<String>();

		al.add("Abc");
		al.add("Abc");
		al.add("Abc");
		al.add("Abc");
		al.add("Abc");
		al.add("Bhy");
		// al.add(7788);

		System.out.println(al);
	}

}
