package org.mervegundogmus.oopj.week6.AbstractStudent;

import java.util.Date;
import java.util.Random;

public class RegistrationOffice {

	RegistrationOffice() {
		super();
	}

	public Student getAStudent() {

		Random random = new Random();
		int i = random.nextInt(5);

		AbstractStudent student = null;
		switch (i) {
		case 0:
			student = new MasterStudent(1, "Arven", 2001, new Date(), "Psychology");
			break;
		case 1:
			student = new PhdStudent(2, "Aysegul", 1997, new Date(), "Engineer");
			break;
		case 2:
			student = new GraduateStudent(3, "Elcin", 2000, new Date(), "History");
			break;
		case 3:
			student = new UndergraduateStudent(4, "Ali", 1996, new Date(), "Chemistry");
			break;
		case 4:
			student = new VocationalStudent(5, "Egemen", 1998, new Date(), "Civil Engineer");
			break;
		}

		return student;

	}

	public void registerStudent(AbstractStudent student) {

		if (student instanceof PhdStudent) {

			PhdStudent phdStudent = (PhdStudent) student;
			phdStudent.register();
			System.out.println(phdStudent.toString());

		} else if (student instanceof MasterStudent) {

			MasterStudent masterStudent = (MasterStudent) student;
			masterStudent.register();
			System.out.println(masterStudent.toString());

		} else if (student instanceof GraduateStudent) {

			GraduateStudent graduateStudent = (GraduateStudent) student;
			graduateStudent.register();
			System.out.println(graduateStudent.toString());

		} else if (student instanceof UndergraduateStudent) {

			UndergraduateStudent undergraduateStudent = (UndergraduateStudent) student;
			undergraduateStudent.register();
			System.out.println(undergraduateStudent.toString());

		} else if (student instanceof VocationalStudent) {

			VocationalStudent vocationalStudent = (VocationalStudent) student;
			vocationalStudent.register();
			System.out.println(vocationalStudent.toString());

		} else {
			System.out.println("Student " + student.getName() + " has registered.");
		}

	}

}
