package com.java.collections.list.linkedList;

public class LinkedListInfo {

}


//LinkedList is a class that is part of the Java Collections Framework and is located in the java.util package. 
//It implements the List and Deque interfaces, making it a versatile data structure for use in a variety of scenarios. 
//It is a doubly-linked list, meaning each element points to both the next and previous elements in the list.


//Key Features of LinkedList in Java:
//	Dynamic Size: The size of a LinkedList can grow or shrink dynamically as elements are added or removed.
//	Efficient Insertion/Deletion: Insertion and deletion of elements at the beginning or middle of the list are more efficient compared to an ArrayList because there is no need to shift elements.
//	Implements List Interface: Since it implements the List interface, it allows for random access, insertion, and deletion of elements.
//	Implements Deque Interface: It also implements the Deque interface, which means it supports operations to add or remove elements from both ends of the list.


//Key Methods of LinkedList
//	Adding Elements
//		add(E e) - Adds the specified element to the end of the list.
//		add(int index, E element) - Inserts the specified element at the specified position in the list.
//		addFirst(E e) / addLast(E e) - Adds an element to the beginning or the end of the list.
//
//	Accessing Elements
//		get(int index) - Returns the element at the specified position in the list.
//		getFirst() / getLast() - Returns the first or last element of the list.
//
//	Removing Elements
//		remove(int index) - Removes the element at the specified position in the list.
//		remove(Object o) - Removes the first occurrence of the specified element from the list.
//		removeFirst() / removeLast() - Removes the first or last element from the list.
//
//	Traversal
//		You can use a for-each loop or an iterator to traverse through the list.
//		It also supports descending iteration using the descendingIterator() method.
//		
//	Other Useful Methods
//		size() - Returns the number of elements in the list.
//		contains(Object o) - Checks if the list contains the specified element.
//		isEmpty() - Checks if the list is empty.
//		clear() - Removes all the elements from the list.


//When to Use LinkedList over ArrayList
//	Use LinkedList if you need frequent insertion or deletion operations, especially at the beginning or in the middle of the list.
//	Use ArrayList if you need fast random access and primarily work with retrieving elements.

//Performance Considerations
//	Insertion and Deletion: LinkedList performs better for insertions and deletions because it only updates pointers (O(1) complexity), whereas ArrayList may need to shift elements (O(n) complexity).
//	Access Time: LinkedList has slower access time (O(n)) for retrieving elements compared to ArrayList's fast access (O(1)), as it requires traversing the list to find elements.


//LinkedList as a Deque
//	Since LinkedList implements the Deque interface, it also supports operations for use as a double-ended queue, such as:
//		offerFirst(E e): Adds the specified element to the front (beginning) of the list. This method is similar to pushing an element onto a stack or inserting it at the head of the queue.
//		offerLast(E e): Adds the specified element to the back (end) of the list, which is the same as a standard add operation in a queue.
//		pollFirst(): Retrieves and removes the first element of the list (head of the queue). If the list is empty, it returns null.
//		pollLast(): Retrieves and removes the last element of the list (tail of the queue). If the list is empty, it also returns null.
//		peekFirst(): Retrieves (but does not remove) the first element of the list. Returns null if the list is empty.
//		peekLast(): Retrieves (but does not remove) the last element of the list. Also returns null if the list is empty.









//------------- ArrayList VS LinkedList

//ArrayList: Best for fast random access and retrieval operations (O(1) complexity). 
//			 Slower at insertion and deletion in the middle of the list (O(n) complexity) due to element shifting. 
//			 Ideal for cases where reads are frequent and modifications are minimal. Uses a contiguous array for storage.
//
//LinkedList: Best for frequent insertions and deletions at both ends or in the middle (O(1) complexity) since it only involves changing node pointers. 
//			  Slower random access (O(n) complexity) because it requires traversal from the beginning. 
//			  Ideal when modifications are frequent and sequential access is common. Uses a doubly-linked list structure.
//
//Choose ArrayList for fast access, LinkedList for frequent updates.





