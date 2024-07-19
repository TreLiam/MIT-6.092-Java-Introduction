package assignment;

import java.util.ArrayList;

public class Library {

	// Add the missing implementation to this class
	private String address;
	private int bookCount = 0;
	private ArrayList<Book> bookList = new ArrayList<Book>();
	
	static String openingHours = "9am to 5pm";
	
	//Create a new library.
	Library(String libraryAddress){
		this.address = libraryAddress;
	}
	
	//Add a new book into the library.
	public void addBook(Book newBook) {
		this.bookList.add(newBook);
		bookCount ++;
	}
	
	//Borrow the book from the library.
	public void borrowBook(String bookTitle) {
		boolean findBook = false;
		
		for(int i = 0; i < this.bookCount; i++) {
			Book tmpBook = this.bookList.get(i);
			
			if(tmpBook.getTitle().equals(bookTitle)) {
				findBook = true;
				
				if(tmpBook.isBorrowed() == false) {
					tmpBook.borrowed();
					System.out.println("You successfully borrowed " + bookTitle);
				}
				else {
					System.out.println("Sorry, this book is already borrowed.");
				}
				
				break;
			}
		}
		//This book is not in this library's bookList.
		if(findBook == false) System.out.println("Sorry, this book is not in our catlog.");
	}
	
	//Return the book back to the library.
	public void returnBook(String bookTitle) {
		for(int i = 0; i < this.bookCount; i++) {
			Book tmpBook = this.bookList.get(i);
			
			if(tmpBook.getTitle().equals(bookTitle)) {
				tmpBook.returned();
				System.out.println("You successfully returned " + bookTitle);
			}
		}
	}
	
	//Print books that are available.
	public void printAvailableBooks() {
		//There is no book in the library.
		if(this.bookCount == 0) System.out.println("No book in catalog");
		
		//Find books that are not borrowed
		else {
			for(int i = 0; i < this.bookCount; i++) {
				Book tmpBook = this.bookList.get(i);
				
				if(tmpBook.isBorrowed() == false) {
					System.out.println(tmpBook.getTitle());
				}
			}
		}
	}
	
	//Print library's opening hours.
	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from " + openingHours);
	}
	
	//Print library's address.
	public void printAddress() {
		System.out.println(this.address);
	}
	
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }

}
