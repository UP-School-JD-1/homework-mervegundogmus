package org.mervegundogmus.oopj.week8.Book;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class MethodReferences {
	public static void main(String[] args) {

		Comparator<Book> pageBookComparator = Comparator.comparingInt(Book::getPages);
		BinaryOperator<Book> morePageOf = BinaryOperator.maxBy(pageBookComparator);
		Book o = Book.list.stream().collect(Collectors.reducing(morePageOf)).get();
		System.out.println("Book with the most pages: " + "[ " + o + " ]");

	}
}
