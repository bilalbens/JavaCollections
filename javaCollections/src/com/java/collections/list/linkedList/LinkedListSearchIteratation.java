package com.java.collections.list.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSearchIteratation {

	public static void main(String[] args) {
		LinkedList<String> lang = new LinkedList<String>();

		lang.add("C"); // 0
		lang.add("C++"); // 1
		lang.add("Core Java"); // 2
		lang.add("Java EE"); // 3
		lang.add("Spring Framework"); // 4
		lang.add("Spring Framework"); // 5
		lang.add("Hibernate Framework");

		// Returns true if this list contains the specified element
		boolean result = lang.contains("C");
		System.out.println("result = " + result);

		// Find the index of the first occurrence of an element in the LinkedList
		int index = lang.indexOf("Core Java");
		System.out.println("index = " + index);

		// Find the index of the last occurrence of an element in the LinkedList
		int lastIndex = lang.lastIndexOf("Spring Framework");
		System.out.println("lastIndex => " + lastIndex);

		// iterator
		Iterator<String> iterator = lang.iterator();
		while (iterator.hasNext()) {
			String prog = (String) iterator.next();
			System.out.println(prog);
		}

		// forEach
		lang.forEach((element) -> {
			System.out.println(element);
		});
		// for each advanced loop
		for (String e : lang) {
			System.out.println(e);
		}

	}
}
