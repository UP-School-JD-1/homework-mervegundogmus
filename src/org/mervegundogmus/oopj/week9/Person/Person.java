package org.mervegundogmus.oopj.week9.Person;

import java.util.List;
import java.util.Objects;

public final class Person implements Comparable<Object> {
	private final String firstName;
	private final String lastName;
	private List<String> address;
	private List<Integer> phone;

	public Person(String firstName, String lastName, List<String> address, List<Integer> phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public List<Integer> getPhone() {
		return phone;
	}

	public void setPhone(List<Integer> phone) {
		this.phone = phone;
	}

	public int compareTo(Object o) {
		Person person = (Person) o;
		return lastName.compareTo(person.getLastName());
	}

	@Override
	public String toString() {
		return "Person => Firstname: " + firstName + " | Lastname: " + lastName + " | Address: " + address + " | Phone: "
				+ phone + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, address, phone);
	}

}
