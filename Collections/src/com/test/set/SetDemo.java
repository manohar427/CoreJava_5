package com.test.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
      
		HashSet set = new HashSet();
		set.add(122);
		set.add("Abc");
		set.add(122.34);
		set.add(12);
		set.add('J');
		
		System.out.println(set);
		
		LinkedHashSet lhset = new LinkedHashSet();
		lhset.add(122);
		lhset.add("Abc");
		lhset.add(122.34);
		lhset.add(12);
		lhset.add('J');
		
		System.out.println(lhset);
		
		TreeSet tset = new TreeSet();
		tset.add(122);
		tset.add(128);
		tset.add(12);
		tset.add(777);
		tset.add(777);
		tset.add(777);
		tset.add(777);
		tset.add(777);
		tset.add(8898);

		System.out.println(tset);
		
		TreeSet ttset = new TreeSet();
		ttset.add("W");
		ttset.add("J");
		ttset.add("K");
		ttset.add("J");
		ttset.add("L");
		ttset.add("J");

		System.out.println(ttset);
	}

}
