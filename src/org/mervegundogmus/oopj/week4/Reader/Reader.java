package org.mervegundogmus.oopj.week4.Reader;

public class Reader {
	    String firstName;
	    String lastName;
	    int age;
	    public Reader(String firstName,String lastName, int age) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age = age;
	    }


	    public String getFirstName() {
	        return firstName;
	    }
	    
	    public String getLastName() {
	        return lastName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	    
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public void getInfo() {
	        System.out.println("Reader: " + firstName + " , " + lastName + " , " + age );
	    }
}

