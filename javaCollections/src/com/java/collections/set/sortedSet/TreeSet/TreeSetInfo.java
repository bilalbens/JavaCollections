package com.java.collections.set.sortedSet.TreeSet;

import java.util.TreeSet;

public class TreeSetInfo {
}

//TreeSet is a specific implementation of the Set interface in Java that is based on a tree data structure. 
//It is part of the java.util package and provides several unique features and characteristics that differentiate it from other Set implementations like HashSet and LinkedHashSet. 
//Here's a more detailed look at TreeSet:

//Key Features of TreeSet

//1-Sorted Order:
//	TreeSet stores its elements in sorted (natural) order by default.
//	The order is determined by the elements' natural ordering (as defined by the Comparable interface) or by a custom comparator provided at the time of TreeSet creation.
//	If you use a custom comparator, you can define a specific ordering, such as reverse order or a different custom logic.

//2-NavigableSet Interface:
//	TreeSet implements the NavigableSet interface, which provides methods for navigation through the elements.
//	You can use methods like lower(), higher(), floor(), and ceiling() to quickly find elements relative to a given value.
//	Methods like subSet(), headSet(), and tailSet() allow you to create subviews of the set for specific ranges.

//3-No Duplicates:
//	Just like other sets, TreeSet does not allow duplicate elements. If you try to add a duplicate element, it will simply be ignored.

//4-Null Elements:
//	TreeSet does not allow null elements if it uses natural ordering because the comparison of null with other elements will cause a NullPointerException.
//	If you use a custom comparator that can handle null values, then it might be possible to have null elements.

//5-Performance:
//	The operations in a TreeSet (like add, remove, contains) have a time complexity of O(log n) because it is based on a Red-Black tree (a type of self-balancing binary search tree).
//	This makes TreeSet slower than HashSet for these operations, which have an average time complexity of O(1), but it maintains a sorted order which HashSet does not.

//Key Methods in TreeSet
//	Here are some commonly used methods in the TreeSet class:
//
//		add(E e): Adds the specified element to the set if it is not already present.
//		remove(Object o): Removes the specified element from the set.
//		first(): Returns the first (lowest) element in the set.
//		last(): Returns the last (highest) element in the set.
//		lower(E e): Returns the greatest element less than the specified element, or null if there is no such element.
//		higher(E e): Returns the least element greater than the specified element, or null if there is no such element.
//		floor(E e): Returns the greatest element less than or equal to the specified element, or null if there is no such element.
//		ceiling(E e): Returns the least element greater than or equal to the specified element, or null if there is no such element.
//		subSet(E fromElement, E toElement): Returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive.
//		headSet(E toElement): Returns a view of the portion of this set whose elements are strictly less than toElement.
//		tailSet(E fromElement): Returns a view of the portion of this set whose elements are greater than or equal to fromElement.

//Advantages of TreeSet
//	Automatically sorted: Always maintains elements in sorted order.
//	Efficient searching: Offers logarithmic time complexity for search operations.
//	Range operations: Allows you to perform range-based operations like subset,headset, and tailset.

//Disadvantages of TreeSet
//	Slower performance: Compared to HashSet, operations like insertion, deletion, and search are slower due to the O(log n) complexity.
//	Memory overhead: Requires more memory than HashSet because it uses a tree structure.
//	No null elements: Does not allow null if using natural ordering, which can be restrictive.

//When you use a TreeSet with a custom object type like Student, you must ensure that the Student class either implements the Comparable interface or you provide a custom Comparator to the TreeSet.
//This is necessary because the TreeSet needs a way to compare objects to maintain its sorted order.


//Two Ways to Sort Custom Objects in a TreeSet
//
//	Using the Comparable Interface:
//		If the Student class implements the Comparable interface, you will define the natural ordering of the objects directly in the class itself by implementing the compareTo() method.
//		The TreeSet will use this method to sort the elements.
//	
//	Using a Comparator:
//		If you do not want to or cannot modify the Student class, you can use a Comparator when creating the TreeSet.
//		This allows you to define a custom comparison logic outside of the class itself.

class StudentA {
	private int id;
	private String name;

	public StudentA(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{id=" + id + ", name='" + name + "'}";
	}
}

class TreeSetWithoutComparable {
	public static void main(String[] args) {
		TreeSet<StudentA> students = new TreeSet<>(); // No Comparator provided

		students.add(new StudentA(3, "Alice"));
		students.add(new StudentA(1, "Bob"));
		students.add(new StudentA(2, "Charlie")); // This line will throw an error
	}
}

//Exception in thread "main" java.lang.ClassCastException: Student cannot be cast to Comparable

class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// Implementing the compareTo method to order by ID
	@Override
	public int compareTo(Student other) {
		return Integer.compare(this.id, other.id); // Compare by ID
	}

	@Override
	public String toString() {
		return "Student{id=" + id + ", name='" + name + "'}";
	}
}

class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Student> students = new TreeSet<>();

		students.add(new Student(3, "Alice"));
		students.add(new Student(1, "Bob"));
		students.add(new Student(2, "Charlie"));

		// The TreeSet will automatically sort the students by their ID
		System.out.println("Sorted Students: " + students);
		// Output: [Student{id=1, name='Bob'}, Student{id=2, name='Charlie'},
		// Student{id=3, name='Alice'}]
	}
}

///////////////// OR 

class StudentB implements Comparable<StudentB> {
	private int id;
	private String name;

	public StudentB(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// Implementing the compareTo method to order by ID
	@Override
	public int compareTo(StudentB other) {
		return Integer.compare(this.id, other.id); // Compare by ID
	}

	@Override
	public String toString() {
		return "Student{id=" + id + ", name='" + name + "'}";
	}
}

class TreeSetStudentB {
	public static void main(String[] args) {
		TreeSet<Student> students = new TreeSet<>();

		students.add(new Student(3, "Alice"));
		students.add(new Student(1, "Bob"));
		students.add(new Student(2, "Charlie"));

		// The TreeSet will automatically sort the students by their ID
		System.out.println("Sorted Students: " + students);
		// Output: [Student{id=1, name='Bob'}, Student{id=2, name='Charlie'},
		// Student{id=3, name='Alice'}]
	}
}
