package org.mervegundogmus.oopj.week2;

public class Casts {
	public static void main(String[] args) {

		// NarrowingConversion
		System.out.println();
		byte b = 0;
		short s = 1000;
		char c;
		int i = -100;
		long l = 100_000_000_000l;
		double d = 98.014_353_459_485_483d;

		
		b = (byte) s;
		System.out.println("s: " + s + "\t\t\tb: " + b);
		
		i = (int) l; 	// Loss of info
		System.out.println("l: " + l + "\t\ti: " + i);
		
		i = (int) d;
		System.out.println("d: " + d + "\ti: " + i);
		
		// WideningConversion
		byte m = 126;
		short n = 1000;
		float f = 3.14f;
		
		n = m;
		l = i;
		// Loss of precision
		f = i;
		System.out.println("i: " + i + " f: " + f);
		
		l = i + 1;
		System.out.println("i: " + i + " l: " + l);
		
		// Loss of precision
		l = 987_654_321_123_456_789L;
		f = l;
		System.out.println("l: " + l + " f: " + f);
	}

}
