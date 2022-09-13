package org.mervegundogmus.oopj.week6.AbstractStudent;

import java.util.Date;

public class GraduateStudent extends AbstractStudent {

	String advisor;
	String thesis;

	public GraduateStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);

	}

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public String getThesis() {
		return thesis;
	}

	public void setThesis(String thesis) {
		this.thesis = thesis;
	}

	@Override
	public void study() {
		System.out.println("Student " + getName() + " is studying as a Graduate Student. ");
	}

	@Override
	public void register() {
		System.out.println("Student " + getName() + " is registered as a Graduate Student. ");
	}

	public void writeThesis() {
		System.out.println("Graduate Student " + getName() + " is writing a thesis. " + getThesis());
	}

	public void meetWithAdvisor() {
		System.out.println("Graduate Student " + getName() + " is meeting with advisor. " + getAdvisor());
	}

}
