package Lms;
import java.util.*;

public class Library {
	Scanner sc = new Scanner (System.in);
	
	HashMap <Integer, Book> map = new HashMap <>();
	
	// Add Book
	public void addBook () {
		System.out.print("Enter Book-Id: ");
		int bookId = sc.nextInt();
		
		System.out.print("Enter Book-Title: ");
		String title = sc.next();
		
		System.out.print("Enter Book-Author: ");
		String author = sc.next();
		
		System.out.print("Enter Book-Price: ");
		float price = sc.nextFloat();
		
		Book b = new Book (bookId, title, author, price);
		map.put (bookId, b);
		System.out.println("Book Added Suscessfully");
	}
	
	public void retriveBook () {
		System.out.print("Enter Book-Id to retrive: ");
		int id = sc.nextInt();
		
		Book b = map.get(id);
		if (b != null) {
			b.printBook();
		}else {
			System.out.println("Book Not Found");
		}
	}
	
	public void checkById() {
		System.out.print("Enter Book-Id to Check : ");
		int id = sc.nextInt();
		
		Book b = map.get(id);
		if (map.containsKey(id)) {
			System.out.println("Book " + id + " Available in the library");
		}else {
			System.out.println("Book out of stock");
		}
	}
	
	public void checkByObj () {
		System.out.print("Enter Book-Id to Check : ");
		int id = sc.nextInt();
		
		Book b = map.get(id);
		if (b != null && map.containsValue(b)) {
			System.out.println("Book Available in the library");
		}else {
			System.out.println("Book Not Available");
		}
	}
	
	public void numOfBook () {
		System.out.println("Total Number of Books Available in the library: " + map.size());
	}
	
	public void iterateBooks () {
		System.out.println("______________ Using Entry Set ______________");
		
		for (Map.Entry <Integer, Book> hm : map.entrySet()) {
			System.out.println("Id: " + hm.getKey());
			hm.getValue().printBook();
		}
		
		System.out.println("______________ Using Key Set ______________");
		
		for (Integer key : map.keySet()) {
			System.out.println(key);
			
			System.out.println(map.get(key));
		}
		
		
		System.out.println("______________ Using Values _______________");
		for (Book b : map.values()) {
			b.printBook();
		}
	}
	
	public void updateBook () {
		System.out.print("Enter Book-Id to Update : ");
		int id = sc.nextInt();
		
		if (map.containsKey(id)) {
			System.out.print("Enter new Book Price: ");
			float price = sc.nextFloat();
			Book old = map.get(id);
			Book update = new Book (id, old.title, old.author, price);
			map.replace(id, update);
			System.out.println("Book Price Updated");
		}else {
			System.out.println("Enter Book-Id Not Found");
		}
	}
	
	public void removeBook () {
		System.out.print("Enter Book-Id to Remove : ");
		int id = sc.nextInt();
		
		if (map.remove(id) != null) {
	
			System.out.println("Book Deleted Suscessfully");
		}else {
			System.out.println("You entered a wrong book-id");
		}
	}
	
	public void clearAllBooks () {
		map.clear();
		System.out.println("All books cleared from the library !!");
	}
	
	public void checkEmpty() {
		if (map.isEmpty()) {
			System.out.println("Library is empty");
		}else {
			System.out.println();
		}
	}
}
