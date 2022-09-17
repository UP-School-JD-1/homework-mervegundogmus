package org.mervegundogmus.oopj.week6.Temperature;

public class Main {
	public static void main(String[] args) {
		Celcius cel = new Celcius(20);
		Kelvin kel = new Kelvin(303);
		Fahrenheit fah = new Fahrenheit(100);

		System.out.println(cel.getDegree() + " celcius = " + cel.convert(DegreeType.Kelvin) + " Kelvin");
		System.out.println(kel.getDegree() + " kelvin = " + kel.convert(DegreeType.Celcius) + " Celcius");
		System.out.println(cel.getDegree() + " celcius = " + cel.convert(DegreeType.Fahrenheit) + " Fahrenheit");
		System.out.println(fah.getDegree() + " fahrenheit = " + fah.convert(DegreeType.Kelvin) + " Kelvin");
	}
}
