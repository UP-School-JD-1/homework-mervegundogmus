package org.mervegundogmus.oopj.week9.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonTest {
	public static void main(String[] args) {

		List<String> address1 = new ArrayList<>(List.of("Istanbul", "Kartal", "Soğanlık Mah."));
		List<String> address2 = new ArrayList<>(List.of("Eskişehir", "Tepebaşı", "Uludere Mah."));
		List<String> address3 = new ArrayList<>(List.of("Ankara", "Çankaya", "Anıttepe Mah."));
		List<String> address4 = new ArrayList<>(List.of("Samsun", "Vona", "Esenepe Mah."));
		List<String> address5 = new ArrayList<>(List.of("Eskişehir", "Odunpazarı", "İstiklal Mah."));
		List<Integer> phone1 = new ArrayList<>(List.of(531995548));
		List<Integer> phone2 = new ArrayList<>(List.of(53245687));
		List<Integer> phone3 = new ArrayList<>(List.of(536476466));
		List<Integer> phone4 = new ArrayList<>(List.of(535745585));
		List<Integer> phone5 = new ArrayList<>(List.of(534454525));

		Person p1 = new Person("Merve", "Sarı", address1, phone1);
		Person p2 = new Person("Ahmet", "Anıl", address2, phone2);
		Person p3 = new Person("Mert", "Ali", address3, phone3);
		Person p4 = new Person("Mustafa", "Kemal", address4, phone4);
		Person p5 = new Person("Arven", "Duru", address5, phone5);

		List<Person> personList = new ArrayList<>(List.of(p1, p2, p3, p4, p5));

		System.out.println("Person List");
		System.out.println(personList);
		System.out.println();
		System.out.println("Sortby Lastname");
		System.out.println();
		Comparator<Person> personLastName = (pr1, pr2) -> pr1.getLastName().compareTo(pr2.getLastName());
		Collections.sort(personList, personLastName);
		for (Person pr : personList)
			System.out.println(pr.getLastName());

		System.out.println();

		System.out.println("Sortedby Firstname");
		System.out.println();
		Map<String, Person> map = new HashMap<>();
		map.put(p1.getFirstName(), p1);
		map.put(p2.getFirstName(), p2);
		map.put(p3.getFirstName(), p3);
		map.put(p4.getFirstName(), p4);
		map.put(p5.getFirstName(), p5);
		map.forEach((Firstname, Info) -> System.out.println("Firstname: " + Firstname + "\nInformation: " + Info));

	}

}