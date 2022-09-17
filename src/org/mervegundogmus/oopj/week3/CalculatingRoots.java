package org.mervegundogmus.oopj.week3;

import java.util.Scanner;

public class CalculatingRoots {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(
				"(ax²+bx+c) is a quadratic equation.\n Enter the constants in the equation in order as follows.");

		System.out.print("Enter a value :");
		double a = sc.nextInt();
		System.out.print("Enter b value   :");
		double b = sc.nextInt();
		System.out.print("Enter c value   :");
		double c = sc.nextInt();

		double delta = (b * b) - (4 * a * c);

		if (delta > 0) {
			double x1 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);
			double x2 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
			System.out.println("x1= " + x1 + " x2= " + x2);
		}
		if (delta < 0) {
			System.out.println("The equation has no real root.");
		}
		if (delta == 0) {
			double x = (-1 * b) / (2 * a);
			System.out.println("Has coincident root x1= x2= " + x);
		}

	}

}
