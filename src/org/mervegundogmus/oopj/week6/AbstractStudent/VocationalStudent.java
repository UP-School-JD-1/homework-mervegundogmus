package org.mervegundogmus.oopj.week6.AbstractStudent;

import java.util.Date;

public class VocationalStudent extends AbstractStudent {

	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);

	}

	@Override
	public void study() {
		System.out.println(getName() + " is studying who is Vocational Student ");
	}

	@Override
	public void register() {
		System.out.println(getName() + " is registered who is Vocational Student ");
	}

}
