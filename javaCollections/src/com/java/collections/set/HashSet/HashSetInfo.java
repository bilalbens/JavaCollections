package com.java.collections.set.HashSet;

public class HashSetInfo {

}


//HashSet is a part of the Java Collections Framework and is an implementation of the Set interface that uses a hash table for storage. 
//It is one of the most commonly used data structures for storing unique elements in Java. 


//Key Features of HashSet
//	Unique Elements: A HashSet does not allow duplicate elements. If you try to add a duplicate element, it simply won't be added to the set.
//	Unordered Collection: The elements in a HashSet are not stored in any particular order. The order might change over time, especially as elements are added and removed.
//	Null Values: It allows a single null value to be added.
//	Non-Synchronized: HashSet is not synchronized, which means it's not thread-safe by default. If you need to use it in a multi-threaded environment, you should synchronize it manually.
//	Constant Time Operations: Most operations, such as adding, removing, and checking for an element, are O(1) on average, meaning they are very fast because of the underlying hash table structure.
//	Backed by HashMap: Internally, HashSet uses a HashMap to store its elements.



//Important Methods in HashSet
//	add(E e):	Adds the specified element to the set if not already present.
//	remove(Object o):	Removes the specified element from the set, if present.
//	contains(Object o):	Returns true if this set contains the specified element.
//	size():	Returns the number of elements in the set.
//	clear():	Removes all of the elements from the set.
//	isEmpty():	Checks if the set is empty.
//	iterator():	Returns an iterator over the elements in the set.



//When to Use HashSet
//	Unique Elements: Use HashSet when you need to maintain a collection of unique items and don't care about the order.
//	Fast Operations: When you need fast operations for insertion, deletion, and lookup, as these operations have a time complexity of O(1) on average.


//Drawbacks of HashSet
//	No Order Guarantee: Elements are not stored in any particular order, so it cannot be used if you require order in your collection.
//	Not Thread-Safe: It's not synchronized by default, which means it can cause problems if multiple threads are accessing and modifying the same HashSet simultaneously.




//////////// IMPORTANT
//If order is important, you might want to consider using LinkedHashSet (maintains insertion order) or TreeSet (maintains sorted order) instead.