package org.mervegundogmus.oopj.week2.Hello;

public class HelloTest {

	public static void main(String[] args) {
		Hello object = new Hello();

		String answer = object.sayHello("Ayşe");
		System.out.println(answer);
		
		answer = object.sayHello("Zeynep");
		System.out.println(answer);
//
		System.out.println("World: " + object.world);
//
		answer = object.sayHello("");
		System.out.println(answer);
	}
}

