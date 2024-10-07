package com.java.collections.queue.PriorityQueue;

public class PriorityQueueInfo {

}


//Class: PriorityQueue is a class that implements the Queue interface.
//
//Behavior: Unlike a regular queue, a PriorityQueue orders its elements according to their natural ordering (if they implement Comparable) or based on a provided Comparator. It does not strictly follow the FIFO principle.
//
//Ordering: The element with the highest priority (or lowest value) will always be at the front of the queue.
//
//Internals: Internally, it uses a binary heap data structure to keep track of elements in a sorted order.
//
//Methods: It supports all the same methods as a standard queue, including:
//	add(E e), offer(E e) to add elements
//	poll(), remove() to remove elements
//	peek(), element() to view elements


//Important Points about PriorityQueue:
//	Ordering: The order in which elements are processed depends on their priority. For example, numbers might be ordered from smallest to largest.
//	Null Elements: It does not allow null values.
//	Thread-Safety: PriorityQueue is not synchronized by default. Use PriorityBlockingQueue for thread-safe operations.





//When you use a TreeSet with a custom Comparator and a PriorityQueue with the same custom ordering logic for custom objects, they appear to behave similarly in terms of how they store and order their elements. 
//However, there are still fundamental differences between the two in terms of use cases, internal data structure, and how they handle certain operations. 
//Let's dive deeper into those differences:

//Similarities when using a Comparator with Custom Objects
//When both TreeSet and PriorityQueue use a custom comparator, they both:
//	Order elements based on the comparator provided.
//	Can work with custom objects that do not implement the Comparable interface.
//	Allow you to define the sorting logic, which could be based on any attribute of the custom object.


//Differences Between PriorityQueue and TreeSet with Custom Objects

//Feature							PriorityQueue															TreeSet
//
//Duplicates						Allows duplicate elements												Does not allow duplicate elements
//Data Structure					Internally uses a binary heap											Uses a Red-Black Tree (self-balancing binary search tree)
//Iteration Order					No guarantee of order when iterating over elements						Always maintains elements in sorted order when iterating
//Primary Use Case					Retrieving elements in priority order (queue operations)				Maintaining a sorted, unique set of elements
//Access Efficiency					Quick access to the highest priority element (O(1) for peek)			Elements are always available in sorted order (O(log n) for access)
//Poll Operation					Polling removes the head element with the highest priority				Polling (or removing) the first element preserves sorted order
//Memory Overhead					Typically lower memory usage due to the heap structure					Slightly higher memory overhead due to the tree structure





//When to Use Each
//Use PriorityQueue when:
//	You need to frequently access and remove the highest priority element.
//	Duplicates are acceptable.
//	Iteration order is not as important.

//Use TreeSet when:
//	You require a sorted collection of unique elements.
//	You need to perform operations like range queries or need sorted iteration.
//	Duplicates should be avoided.





//Differences Between Queue and PriorityQueue
//Feature					Queue														PriorityQueue

//Ordering					FIFO (First-In-First-Out)									Elements are ordered based on priority or comparator.
//Interface or Class			It is an interface											It is a class that implements the Queue interface.
//Implementation				Commonly implemented using LinkedList or ArrayDeque			Internally uses a binary heap data structure.
//Allows null?				Depends on the implementation								Does not allow null elements.
//Use case					Useful for simple queues and FIFO operations				Useful when you need to process elements based on their priority.

//When to Use
//	Use a Queue when you need a simple FIFO data structure for processing elements.
//	Use a PriorityQueue when the order of processing elements matters and you want the elements with the highest priority to be processed first.

