package org.mervegundogmus.oopj.week9.Student.Comparator;

import java.util.ArrayList;
import java.util.Collections;

// Main class
public class StudentTest {
	public static void main(String[] args) {

		// Creating an empty ArrayList of Student type
		ArrayList<Student> ar = new ArrayList<Student>();
		// Adding entries in above List using add() method
		ar.add(new Student(101, "Merve", 25, "Software Engineer"));
		ar.add(new Student(102, "Ahmet", 24, "Computer Engineer"));
		ar.add(new Student(103, "Ali", 23, "Mechanical Engineer"));
		ar.add(new Student(104, "Yemen", 30, "Physics Teacher"));
		ar.add(new Student(205, "Mert", 20, "Sociology"));
		ar.add(new Student(206, "Eflal", 32, "Software Engineer"));
		ar.add(new Student(301, "Egemen", 27, "Mathematic Teacher"));
		ar.add(new Student(107, "Mustafa", 26, "Management Information Systems"));
		ar.add(new Student(402, "Arven", 35, "Industrial Engineer"));

		// Display message on console for better readability
		System.out.println("Unsorted:");

		// Iterating over entries to print them
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		// Sorting student entries by student number
		Collections.sort(ar.new SortbyNo());
		System.out.println("\nSorted by no:");

		// Again Iterating over entries to print them
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		// Sorting student entries by name
		Collections.sort(ar.new SortbyName());
		System.out.println("\nSorted by name:");

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

	}

}
