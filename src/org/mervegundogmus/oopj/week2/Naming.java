package org.mervegundogmus.oopj.week2;


public class Naming {
	//private int integerVariable; 
	//private double doubleVariable;

	public static void main(String[] args) {
		Naming namingDemo = new Naming();
		//namingDemo.integerVariable = 95;
		//namingDemo.doubleVariable = 0.33;
		namingDemo.firstMethod(2, 5);
		namingDemo.secondMethod(8, 4, false);
	}
	
	public void firstMethod(int firstParameter, int secondParameter){
		System.out.println("in firstMethod(int firstParameter, int secondParameter)");
	}
	
	public void secondMethod(int aParameter, long anotherParameter, boolean thirdParameter){
		System.out.println("in secondMethod(int firstParameter, long secondParameter, boolean thirdParameter)");
	}
}
