package org.mervegundogmus.oopj.week8.EvenNumber;

public class EvenNumberOperationsTest {
	private static int result;
	private static int product = 1;
	private static int[] squares = new int[5];

	public static void main(String[] args) {
		EvenNumberOperation printer = (i) -> System.out.print(i + " ");
		printEvenNumbers(10, printer);

		System.out.println();

		printEvenNumbers(10, (i) -> result += i);
		System.out.println("Sum: " + result);

		// int result = calculateSumOfEvenNumbers(10);
		// System.out.println("Sum: " + result);

		printEvenNumbers(10, (i) -> product *= i);
		System.out.println("Product: " + product);

		// result = calculateProductOfEvenNumbers(10);
		// System.out.println("Product: " + result);

		printEvenNumbers(10, (i) -> {
			squares[i / 2 - 1] = i * i;
		});

		// int[] square = calculateSquareOfEvenNumbers(10);

		System.out.print("Squares: [ ");
		for (int i : squares)
			System.out.print(i + " ");
		System.out.println("]");

	}

	public static void printEvenNumbers(int n, EvenNumberOperation operation) {
		for (int i = 2; i <= n; i += 2)
			operation.operate(i);
	}

}
