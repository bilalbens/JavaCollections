package com.java.collections.queue;

public class QueueInfo {
}


// Queue

//Interface: Queue is an interface in Java that extends the Collection interface.

//Behavior: It represents a data structure that follows the FIFO (First-In-First-Out) principle, where elements are inserted at the end and removed from the front.

//Implementations: Common implementations of the Queue interface include:
//	LinkedList (used as a basic queue)
//	ArrayDeque (used as a more efficient queue)

//Methods: Some of the main methods in the Queue interface include:
//	add(E e): Inserts the specified element into the queue. Throws an exception if it fails.
//	offer(E e): Inserts the specified element into the queue. Returns false if it fails.
//	poll(): Retrieves and removes the head of the queue or returns null if the queue is empty.
//	remove(): Retrieves and removes the head of the queue. Throws an exception if the queue is empty.
//	peek(): Retrieves, but does not remove, the head of the queue or returns null if the queue is empty.
//	element(): Retrieves, but does not remove, the head of the queue. Throws an exception if the queue is empty.



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
