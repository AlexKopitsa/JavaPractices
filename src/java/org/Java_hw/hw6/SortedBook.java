package org.Java_hw.hw6;
import java.util.ArrayList;
import java.util.List;

public class SortedBook {
	public List<Book> sortedByAuthor(String nameAuthor, List<Book> arrOfBooks) {
		List<Book> resArray = new ArrayList<Book>();
		for (Book book : arrOfBooks) {
			if (book.getAuthor().equals(nameAuthor)) {
				resArray.add(book);
			}
		}
		return resArray;
	}
	public List<Book> sortedByPublishingHouse(String publishingHouse, List<Book> arrOfBooks) {
		List<Book> resArray = new ArrayList<Book>();
		for (Book book : arrOfBooks) {
			if (book.getPublishingHouse().equals(publishingHouse)) {
				resArray.add(book);
			}
		}
		return resArray;
	}
	public List<Book> sortedByYear(int year, List<Book> arrOfBooks) {
		List<Book> resArray = new ArrayList<Book>();
		for (Book book : arrOfBooks) {
			if (book.getYear() >= year) {
				resArray.add(book);
			}
		}
		return resArray;
	}
}
