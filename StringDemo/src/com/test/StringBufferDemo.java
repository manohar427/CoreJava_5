package com.test;

public class StringBufferDemo {
	public static void main(String[] args) {

		String s = "Abc";
		s = s+"D";
		s = s+"EF";
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("Abc");
		sb.append("D");
		sb.append("EF");
		
		System.out.println(sb);
	}
}
