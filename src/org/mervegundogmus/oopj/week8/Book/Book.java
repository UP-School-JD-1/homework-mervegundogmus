package org.mervegundogmus.oopj.week8.Book;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("rawtypes")
public class Book implements Comparable {
	private String title;
	private String authorFName;
	private String authorLName;
	private int pages;
	private Type type;

	public Book() {
		this.title = "No title specified!";
		this.authorFName = "No author first name specified!";
		this.authorLName = "No author last name specified!";
		this.pages = 0;

	}

	public Book(String title, String authorFName, String authorLName, int pages, Type type) {
		this.title = title;
		this.authorFName = authorFName;
		this.authorLName = authorLName;
		this.pages = pages;
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthorFName() {
		return authorFName;
	}


	public String getAuthorLName() {
		return authorLName;
	}


	public int getPages() {
		return pages;
	}



	public Type getType() {
		return type;
	}


    @Override
    public String toString() {
        return title;
    }

	@Override
	public int compareTo(Object o) {
		Book book = (Book) o;
		return title.compareTo(book.getTitle());
	}

	
	public static final List<Book> list = Arrays.asList(
		new Book("Effective Java", "Joshua", "Bloch", 717, Type.SCIENCE),
            	new Book("The Cat in the Hat", "Dr", "Seuss", 450, Type.TECHNOLOGY),
            	new Book("Clean Code", "Robert C.", "Martin", 982, Type.COMPUTER),
            	new Book("Harry Potter and The Sorcerers Stone", "JK", "Rowling", 411, Type.MOVIE),
            	new Book("Design Patterns", "Eric", "Gamma", 582, Type.TECHNOLOGY));
}
