package com.java.collections.list.ArrayList;

public class ArrayListInfo {

}


//ArrayList is a resizable array implementation of the List interface in Java. It provides fast random access to elements using an index, with constant-time complexity O(1) for get and set operations.
//It automatically grows in size when new elements are added, but insertion and deletion operations can be slower, O(n), especially when they involve shifting elements.
//It allows duplicate elements and maintains the insertion order. Ideal for use cases where read operations are more frequent than insertions or deletions.


//Use an ArrayList when:
//	Frequent access to elements: You need fast random access to elements using an index (like accessing with get()), as it has O(1) time complexity.
//	Insertion order matters: You want to maintain the order in which elements are added.
//	Dynamic size: You need a collection that can automatically grow in size as you add more elements.
//	Rare insertions or deletions in the middle: The use case involves more reads and fewer modifications in the middle of the list, as insertions and deletions can be costly (O(n) due to shifting elements).
//
//Avoid using ArrayList when you need efficient insertions or deletions at the beginning or middle of the list. For these operations, a LinkedList is a better choice.


//Key Methods of ArrayList
//	Adding Elements
//		add(E e): Appends the specified element to the end of the list.
//		add(int index, E element): Inserts the specified element at the specified position in the list, shifting subsequent elements to the right.
//
//	Accessing Elements
//		get(int index): Returns the element at the specified position in the list.
//	
//	Updating Elements
//		set(int index, E element): Replaces the element at the specified position with the specified element.
//	
//	Removing Elements
//		remove(int index): Removes the element at the specified position in the list.
//		remove(Object o): Removes the first occurrence of the specified element from the list.
//	
//	Searching
//		indexOf(Object o): Returns the index of the first occurrence of the specified element, or -1 if the element is not found.
//		contains(Object o): Returns true if the list contains the specified element.
//	
//	Size and Capacity
//		size(): Returns the number of elements in the list.
//		isEmpty(): Returns true if the list contains no elements.
//	
//	Clearing the List
//		clear(): Removes all elements from the list, leaving it empty.
//	
//	Converting to an Array
//		toArray(): Converts the list into an array.
//		toArray(T[] a): Returns an array containing all the elements in the list in proper sequence.



// ------------- ArrayList VS LinkedList

//ArrayList: Best for fast random access and retrieval operations (O(1) complexity). 
//			 Slower at insertion and deletion in the middle of the list (O(n) complexity) due to element shifting. 
//			 Ideal for cases where reads are frequent and modifications are minimal. Uses a contiguous array for storage.
//
//LinkedList: Best for frequent insertions and deletions at both ends or in the middle (O(1) complexity) since it only involves changing node pointers. 
//			  Slower random access (O(n) complexity) because it requires traversal from the beginning. 
//			  Ideal when modifications are frequent and sequential access is common. Uses a doubly-linked list structure.
//
//Choose ArrayList for fast access, LinkedList for frequent updates.