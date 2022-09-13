package org.mervegundogmus.oopj.week6.AbstractStudent;

import java.util.Date;

public class PhdStudent extends GraduateStudent {

	boolean qualifyingExamTaken;

	public PhdStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
		// TODO Auto-generated constructor stub
	}

	public boolean isQualifyingExamTaken() {
		return qualifyingExamTaken;
	}

	public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	@Override
	public void study() {
		System.out.println("Student " + getName() + " is studying as a Phd Student. ");
	}

	@Override
	public void register() {
		System.out.println("Student " + getName() + " is registered as a Phd Student. ");
	}

	@Override
	public void writeThesis() {
		System.out.println(getName() + " is writing thesis " + getThesis());
	}

	@Override
	public void meetWithAdvisor() {
		System.out.println("Phd Student " + getName() + " is writing a thesis. " + getThesis());
	}

	public void writePaper() {
		System.out.println(getMajor() + getName() + "  is writing paper.");
	}

}
