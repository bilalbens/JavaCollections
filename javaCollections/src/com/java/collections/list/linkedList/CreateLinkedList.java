package com.java.collections.list.linkedList;

import java.util.LinkedList;

//add()
//add(2, element)
//addFirst()
//addLat()

public class CreateLinkedList {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("mango");

		System.out.println("initial linkedlist -> " + fruits);

		fruits.add(2, "Watermelomn");
		System.out.println("after adding Watermelon => " + fruits);

		fruits.addFirst("Strawberry");
		System.out.println(" after adding Strawberry => " + fruits);

		fruits.addLast("Orange");
		System.out.println(" after adding Orange => " + fruits);
	}

}
