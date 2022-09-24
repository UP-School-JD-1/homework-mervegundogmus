package org.mervegundogmus.oopj.week9.Student.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {
	public static void main(String args[]) {
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(101, "Merve", 25, "Software Engineer"));
		ar.add(new Student(102, "Ahmet", 24, "Computer Engineer"));
		ar.add(new Student(103, "Ali", 23, "Mechanical Engineer"));
		ar.add(new Student(104, "Yemen", 30, "Physics Teacher"));
		ar.add(new Student(205, "Mert", 20, "Sociology"));
		ar.add(new Student(206, "Eflal", 32, "Software Engineer"));
		ar.add(new Student(301, "Egemen", 27, "Mathematic Teacher"));
		ar.add(new Student(107, "Mustafa", 26, "Management Information Systems"));
		ar.add(new Student(402, "Arven", 35, "Industrial Engineer"));

		Collections.sort(ar);
		for (Student st : ar) {
			System.out.println("Age: " + st.age + " | " + "Student No: " + st.no + " | " + "Name: " + st.name
					+ " | " + "Major: " + st.major);
		}
	}

}
