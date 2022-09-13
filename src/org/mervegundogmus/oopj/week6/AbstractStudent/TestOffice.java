package org.mervegundogmus.oopj.week6.AbstractStudent;

public class TestOffice {

	public static void main(String[] args) {

		RegistrationOffice registrationOffice = new RegistrationOffice();

		Student student = registrationOffice.getAStudent();

		registrationOffice.registerStudent((AbstractStudent) student);

	}

}
