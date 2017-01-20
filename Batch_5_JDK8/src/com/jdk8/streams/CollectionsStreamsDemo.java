package com.jdk8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CollectionsStreamsDemo {

	public static void main(String[] args) {
	/*	List list = new ArrayList();

		for (int i = 0; i < 100; i++) {
			list.add(i);
		}

		Stream<Integer> str = list.stream();

		Stream strNew = str.filter(Integer -> Integer > 50);

		strNew.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println(t);
			};
		});*/
		
		
		
		List list = new ArrayList();

		for (int i = 0; i < 100; i++) {
			list.add(i);
		}

		Stream<Integer> str = list.parallelStream();

		Stream strNew = str.filter(Integer -> Integer > 50);

		strNew.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println(t);
			};
		});
	}

}
