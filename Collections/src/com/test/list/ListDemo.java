package com.test.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
      ArrayList al = new ArrayList();
      al.add(1220);
      al.add("Abc");
      al.add(123.45);
      al.add('H');
      
      System.out.println(al);
      
      LinkedList ll = new LinkedList();
      ll.add(1220);
      ll.add("Abc");
      ll.add(123.45);
      ll.add('H');
      
      System.out.println(ll);
      
      Vector v = new Vector();
      v.add(100);
      v.add(345);
      v.add("Abc");
      
      System.out.println(v);
	}

}
