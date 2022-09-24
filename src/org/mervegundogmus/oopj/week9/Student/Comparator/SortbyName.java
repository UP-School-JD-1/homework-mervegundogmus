package org.mervegundogmus.oopj.week9.Student.Comparator;

import java.util.Comparator;

//Helper class implementing Comparator interface
	class SortbyName implements Comparator<Student> {
	// Method
	// Sorting in ascending order of name
	public int compare(Student st1, Student st2) {
		return st1.name.compareTo(st2.name);
	}
}
