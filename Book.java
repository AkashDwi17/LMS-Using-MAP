package Lms;

public class Book {
	int bookId;
	String title;
	String author;
	float price;
	
	public Book (int bookId, String title, String author, float price) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void printBook () {
		System.out.println("Book-Id: " + bookId + " " + "Book-Title: " + title + " " + "Book-Author: " + author + " " + "Book-Price: " + price);
	}
}
