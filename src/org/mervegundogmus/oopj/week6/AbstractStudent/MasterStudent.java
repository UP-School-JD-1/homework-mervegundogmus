package org.mervegundogmus.oopj.week6.AbstractStudent;

import java.util.Date;

public class MasterStudent extends GraduateStudent {

	public MasterStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
	}

	@Override
	public void study() {
		System.out.println("Student " + getName() + " is studying as a Master Student. ");
	}

	@Override
	public void register() {
		System.out.println("Student " + getName() + " is registered as a Master Student. ");

	}

	@Override
	public void writeThesis() {
		System.out.println("Master Student " + getName() + " is writing a thesis. " + getThesis());
	}

	@Override
	public void meetWithAdvisor() {
		System.out.println("Master Student " + getName() + " is meeting with advisor. " + getAdvisor());
	}

}
