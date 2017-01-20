package com.jdk8.forEach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
       
		//1.Collections forEach loop
		List<Integer> list = new ArrayList();
		
		list.add(12);
		list.add(132);
		list.add(124);
		list.add(172);
		
		/*for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}*/
		
		list.forEach(new Consumer<Integer>() {
			public void accept(Integer i) {
				if(i==124)
				System.out.println(i);
			}
		});
	}

}
