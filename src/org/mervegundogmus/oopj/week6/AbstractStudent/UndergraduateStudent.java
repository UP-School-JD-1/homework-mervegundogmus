package org.mervegundogmus.oopj.week6.AbstractStudent;

import java.util.Date;

public class UndergraduateStudent extends AbstractStudent {
	String minor;

	public UndergraduateStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);

	}

	public String getMinor() {
		return minor;
	}

	public void setMinor(String minor) {
		this.minor = minor;
	}

	@Override
	public void study() {
		System.out.println("Student " + getName() + " is studying as a Undergraduate Student. ");
	}

	@Override
	public void register() {
		System.out.println("Student " + getName() + " is registered as a Undergraduate Student. ");

	}

}
