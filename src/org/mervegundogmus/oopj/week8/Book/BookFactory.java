package org.mervegundogmus.oopj.week8.Book;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookFactory {

	public static List<Book> getBookList() {
		List<Book> books = new ArrayList<>();
		books.add(new Book("The Cat in the Hat", "Dr", "Seuss", 450, Type.TECHNOLOGY));
		books.add(new Book("Harry Potter and The Sorcerers Stone", "JK", "Rowling", 411, Type.MOVIE));
		books.add(new Book("Miss Peregrine's Home for Peculiar Children", "Ranson", "Riggs", 382, Type.MOVIE));
		books.add(new Book("Java Tutorial", "Mark", "Randall", 717, Type.SCIENCE));
		books.add(new Book("Java Lambdas", "John", "Maguire", 182, Type.SCIENCE));
		books.add(new Book("C++ reference", "Herbert", "Schildt", 888, Type.COMPUTER));
		books.add(new Book("Clean Code", "Robert C.", "Martin", 982, Type.COMPUTER));
		books.add(new Book("Effective Java", "Joshua", "Bloch", 717, Type.SCIENCE));
		books.add(new Book("Design Patterns", "Eric", "Gamma", 582, Type.TECHNOLOGY));
		books.add(new Book("Refactoring", "Martin", "Fowler", 982, Type.SCIENCE));
		return books;
	}

	public static Set<Book> getBookSet() {
		Set<Book> books = new HashSet<>();
		books.add(new Book("The Cat in the Hat", "Dr", "Seuss", 450, Type.TECHNOLOGY));
		books.add(new Book("Harry Potter and The Sorcerers Stone", "JK", "Rowling", 411, Type.MOVIE));
		books.add(new Book("Miss Peregrine's Home for Peculiar Children", "Ranson", "Riggs", 382, Type.MOVIE));
		books.add(new Book("Java Tutorial", "Mark", "Randall", 717, Type.SCIENCE));
		books.add(new Book("Java Lambdas", "John", "Maguire", 182, Type.SCIENCE));
		books.add(new Book("C++ reference", "Herbert", "Schildt", 888, Type.COMPUTER));
		books.add(new Book("Clean Code", "Robert C.", "Martin", 982, Type.COMPUTER));
		books.add(new Book("Effective Java", "Joshua", "Bloch", 717, Type.SCIENCE));
		books.add(new Book("Design Patterns", "Eric", "Gamma", 582, Type.TECHNOLOGY));
		books.add(new Book("Refactoring", "Martin", "Fowler", 982, Type.SCIENCE));
		return books;
	}
}
