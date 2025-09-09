package Lms;
import java.util.*;

public class LibraryManagementSystem {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		Library lib = new Library ();
		
		while (true) {
			System.out.println("1: Add Book: ");
			System.out.println("2: Retrive Book: ");
			System.out.println("3: Check Book By Id: ");
			System.out.println("4: Check Book By Object: ");
			System.out.println("5: Number Of Available Books: ");
			System.out.println("6: iterateBooks All Books: ");
			System.out.println("7: Update Book: ");
			System.out.println("8: Remove Book: ");
			System.out.println("9: Clear All Books: ");
			System.out.println("10: Check Empty: ");
			System.out.println("11: Exit");
			
			System.out.println("Enter Your Choice");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1 : lib.addBook(); break;
			case 2 : lib.retriveBook(); break;
			case 3 : lib.checkById(); break;
			case 4 : lib.checkByObj(); break;
			case 5 : lib.numOfBook(); break;
			case 6 : lib.iterateBooks(); break;
			case 7 : lib.updateBook(); break;
			case 8 : lib.removeBook(); break;
			case 9 : lib.clearAllBooks(); break;
			case 10 : lib.checkEmpty(); break;
			default : System.out.println("Enter Correct Choice"); break;
			case 11 : return;
			}	
		}
		
		
	}
}
