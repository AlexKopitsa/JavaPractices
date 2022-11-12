package org.Java_hw.hw6;

public class Book {
	private int id;
	private String name;
	private String author;
	private String publishingHouse;
	private int year;
	private int numberOfPages;
	private double price;
	private String bindingType;
	public Book() {
	}
	public Book(String[] arr) {
		this.id = Integer.parseInt(arr[0]);
		this.name = arr[1];
		this.author = arr[2];
		this.publishingHouse = arr[3];
		this.year = Integer.parseInt(arr[4]);
		this.numberOfPages = Integer.parseInt(arr[5]);
		this.price = Double.parseDouble(arr[6]);
		this.bindingType = arr[7];
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishingHouse() {
		return publishingHouse;
	}
	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBindingType() {
		return bindingType;
	}
	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publishingHouse=" + publishingHouse
				+ ", year=" + year + ", numberOfPages=" + numberOfPages + ", price=" + price + ", BindingType="
				+ bindingType + "]";
	}
}
