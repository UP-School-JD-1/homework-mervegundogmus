package org.mervegundogmus.oopj.week6.Student;

import java.util.Date;

public class Student {
	private int no;
	private String name;
	private int year;
	private Date dob=new Date();
	private String major;
	
	public Student(int no, String name, int year, Date dob, String major) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void study() {
		System.out.println("Ogrenci calisiyor.");
	}

	public void register() {
		System.out.println("Kayit olundu.");
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", year=" + year + ", dob=" + dob + ", major=" + major + "]";
	}

}
