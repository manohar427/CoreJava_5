package com.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
         HashMap hm = new HashMap();
         hm.put("Name", "John");
         hm.put("Age", "25");
         hm.put("Email", "John@live.com");
         
         System.out.println(hm);
         
         LinkedHashMap lhm = new LinkedHashMap();
         lhm.put("Name", "John1");
         lhm.put("Name", "John2");
         lhm.put("Name", "John3");
         lhm.put("Age", "25");
         lhm.put("Email", "John@live.com");
         lhm.put(null, "John@live.com");
         lhm.put("Abc", null);
         
         System.out.println(lhm);
         
         TreeMap  tm = new TreeMap();
         tm.put("Name", "John");
         tm.put("Age", "25");
         tm.put("Email", "John@live.com");
         
         System.out.println(tm);
	}

}
