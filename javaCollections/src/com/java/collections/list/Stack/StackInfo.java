package com.java.collections.list.Stack;

public class StackInfo {

}

//The Stack class in Java is part of the java.util package and extends the Vector class, making it a synchronized (thread-safe) data structure.
//It follows the Last-In-First-Out (LIFO) principle, where the last element added is the first to be removed.
//Although the Stack class is widely used, the Deque interface and its implementations like ArrayDeque are often preferred for modern applications due to better performance and flexibility.


//	Key Methods Explained:

//		push(E item): Adds an item to the top of the stack.
//		pop(): Removes and returns the item from the top of the stack.
//		peek(): Returns the item at the top of the stack without removing it.
//		isEmpty(): Checks if the stack is empty.
//		search(Object o): Returns the 1-based position of the object in the stack, or -1 if not found.


//When to Use a Stack:

//	Expression Parsing: For evaluating mathematical expressions or checking balanced parentheses.
//	Backtracking Algorithms: Such as depth-first search (DFS), puzzle-solving, or pathfinding.
//	Undo Mechanisms: When implementing undo/redo functionality in applications.
//	Call Stack Management: For managing method or function calls in programming languages.



//Alternatives to Stack:
//The Deque interface (like ArrayDeque) is often recommended over Stack for new code:
//	Better Performance: Deques generally provide faster performance without synchronization overhead.
//	More Flexible: Offers both stack-like (LIFO) and queue-like (FIFO) operations.





