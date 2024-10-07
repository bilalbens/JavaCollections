package com.java.collections.set.LinkedHashSet;

public class LinkedHashSetInfo {

}

//LinkedHashSet is a subclass of HashSet in Java that maintains a linked list of the entries in the set, preserving the order in which elements are inserted. 
//It is part of the Java Collections Framework and implements the Set interface, just like HashSet, but with some key differences. 
//Here's an overview of its features and when you might want to use it.

//Key Features of LinkedHashSet
//	Insertion Order: LinkedHashSet maintains the order in which elements are inserted. This means when you iterate over a LinkedHashSet, the elements will be returned in the order they were added.
//	Unique Elements: Like any other set, it does not allow duplicate elements. If you try to add a duplicate, it will not be added to the set.
//	Faster Iteration: Because of the linked list structure, iteration performance is slightly better compared to HashSet. However, operations like insertion, deletion, and lookup still have O(1) complexity on average.
//	Non-Synchronized: It is not synchronized, meaning it is not thread-safe. For multi-threaded environments, you should manually handle synchronization if needed.
//	Allows Null Elements: It permits a single null element, similar to HashSet.aintains insertion order) or TreeSet (maintains sorted order) instead.




//Differences Between HashSet and LinkedHashSet
//Feature								HashSet													LinkedHashSet
//
//Order								No order guarantee (elements unordered).				Maintains insertion order.
//Iteration Performance				Fast iteration, but no order.							Slightly better iteration due to order preservation.
//Internal Structure					Uses a hash table.										Uses a hash table with a doubly linked list.
//Memory Overhead						Lower memory overhead.									Slightly higher memory usage due to the linked list.



//When to Use LinkedHashSet
//	Preserve Order: Use LinkedHashSet when you need to maintain the order of elements as they were inserted.
//	Unique Elements: It ensures that there are no duplicates in the collection, just like other sets.
//	Iteration Performance: When you need fast iteration with predictable order.


//Drawbacks of LinkedHashSet
//	Memory Overhead: It has a higher memory footprint than HashSet due to the additional linked list structure.
//	Not Thread-Safe: It is not synchronized and requires manual handling if used in a multi-threaded environment.




// IMPORTANT
//If order is important in your use case, then LinkedHashSet is a good choice. If you need natural ordering (like sorted order), then TreeSet would be more suitable.