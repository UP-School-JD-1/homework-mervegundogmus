package org.mervegundogmus.oopj.week9.Student.Comparable;

public class Student implements Comparable<Student>{
	int no;
	String name;
	int age;
	String major;

	public Student(int no, String name, int age, String major) {
		this.no = no;
		this.name = name;
		this.age = age;
		this.major = major;
	}

	public int compareTo(Student st) {
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}

}
