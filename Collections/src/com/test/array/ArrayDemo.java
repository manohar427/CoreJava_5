package com.test.array;

import java.util.Arrays;

public class ArrayDemo {

	
	public static void main(String[] args) {
    
		
		int marks [] = {12,10,9,16};
		int rollNum[] = new int[100];
		rollNum[0] = 2020;//99
		
		int sids[] = {45,45,23,55,343,232,2323,54345,22,11,6,11,555};
		String names[] = {"C","Y","J","B"};
		Arrays.sort(sids);
		Arrays.sort(names);
		for (int j : sids) {
			System.out.println(j);
		}
		
		for (String  j : names) {
			System.out.println(j);
		}
		
		/*Student s1 = new Student();
		Student std[] = {s1,s2,s3};*/
		
		
	}

}
