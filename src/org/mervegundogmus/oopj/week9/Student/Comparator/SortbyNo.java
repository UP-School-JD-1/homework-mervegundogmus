package org.mervegundogmus.oopj.week9.Student.Comparator;

import java.util.Comparator;

// Helper class implementing Comparator interface
public class SortbyNo implements Comparator<Student> {
	// Method
	// Sorting in ascending order of student number
	public int compare(Student st1, Student st2) {
		return st1.no - st2.no;
	}
}
