package org.mervegundogmus.oopj.section_1_polymorphism;

import java.util.Date;
import java.util.Random;

public class RegistrationOffice {
	public RegistrationOffice() {
		
	}
	public void RegisterStudent(Student student) {
		if(student instanceof PhdStudent) {
			PhdStudent phd=(PhdStudent) student;
			System.out.println("Phd student " +phd.getName()+" has registered");
		}
		else if(student instanceof MasterStudent) {
			MasterStudent master=(MasterStudent) student;
			System.out.println("Master student "+master.getName()+" has registered." );
		}
		else if(student instanceof GraduateStudent) {
			GraduateStudent grd=(GraduateStudent) student;
			System.out.println("Graduate student "+grd.getName()+" has registered." );
		}
		else if(student instanceof UndergraduateStudent) {
			UndergraduateStudent ugrd=(UndergraduateStudent) student;
			System.out.println("Undergraduate student "+ugrd.getName()+" has registered." );
		}
		else if(student instanceof VocationalStudent) {
			VocationalStudent voc=(VocationalStudent) student;
			System.out.println("vocational student "+voc.getName()+" has registered." );
		}
		else {
			System.out.println("Student " + student.getName() + " has registered.");
		}
	}
	
	@SuppressWarnings("deprecation")
	public Student getAStudent() {
		Student student=null;
		Random r=new Random();
		int i=r.nextInt(5);
		switch(i) {
		case 1:
			student=new VocationalStudent(112, "Egemen", 1998,new Date(1981,8,11), "Civil Engineer");
			break;
		case 2:
			student=new GraduateStudent(245, "Elcin", 2000, new Date(1981,8,12), "Historry", "Salih Atakan");
			break;
		case 3:
			student=new UndergraduateStudent(123, "Ali", 1996, new Date(1981,8,15), "Chemistry", "Geochemistry");
			break;
		case 4:
			student= new MasterStudent(2220, "Arven", 2001, new Date(1981,8,17), "Psychology", "Zeynep Donmez");
			break;
		case 5:
			student=new PhdStudent(345, "Aysegul", 1997, new Date(1981,8,21), "Engineer", "Tamer Dag",true);
			break;
		default:
			student=new Student(567, "Mert", 1992, new Date(1981,8,01), "Sociology");
		}
		
		return student;
	}
}
