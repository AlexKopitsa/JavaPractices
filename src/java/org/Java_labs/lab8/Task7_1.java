// Class work 8
// JavaLabs4 Task 7.1 

package org.Java_labs.lab8;

interface Edition {
    void issued();
}
abstract class Book implements Edition {
    int numOfPages;
    String author;
    Book (int numOfPages, String author) {
        this.numOfPages = numOfPages;
        this.author = author;
    }
	public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getNumOfPages() {
        return numOfPages;
    }
    public String getAuthor() {
        return author;
    }
    @Override
    public void issued() {
        System.out.println("Published by the " + this.author + " and contains " + this.numOfPages + " pages.");
    }
    public abstract void selling ();
    @Override
    public String toString() {
        return "Book {" + '\n' + 
		"numOfPages: " + this.numOfPages + '\n' +
		"author: " + this.author + '\n' + 
		'}';
    }
}
class Directory extends Book {
    int price;
    Directory(int numOfPages, String author, int price){
        super(numOfPages, author);
        this.price = price;
    }
    @Override
    public void selling() {
        System.out.println("The " + this.author + "'s Directory with " + this.numOfPages + " pages was sold to a woman for " + this.price + "$");
    }
}
class Encyclopedia extends Book { 
    int price;
    Encyclopedia(int numOfPages, String author, int price) {
        super(numOfPages, author);
        this.price = price;
    }
    @Override
    public void selling() {
        System.out.println("The " + this.author + "'s book with " + this.numOfPages + " pages was sold to a woman for " + this.price + "$");
    }
}