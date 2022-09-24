package org.mervegundogmus.oopj.week9.Student.Comparator;

public class Student {
	// Attributes of a student
	int no;
	String name;
	int age;
	String major;

	// Constructor
	public Student(int no, String name, int age, String major) {
		// This keyword refers to current instance itself
		this.no = no;
		this.name = name;
		this.age = age;
		this.major = major;
	}
}