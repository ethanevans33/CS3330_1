package assignment1.librarysystem;

public class Library {
	
	private Book[] books;
	private int count;
	
	/**
	 * This is a parameterized method that adds a book to the array (if there is space).
	 * @param book
	 * 			This argument is a book object
	 * @return
	 * 			Returns true if the book was added properly.
	 * 			Returns false if the book could not be added.
	 */
	public boolean addBook(Book book) {
		return false;
	}
	
	/**
	 * This is a parameterized method that removes a book from the array (if it exists).
	 * @param book
	 * 			This argument is a book object
	 * @return
	 * 			Returns true if the book was removed properly.
	 * 			Returns false if the book could not be removed.
	 */
	public boolean removeBook(Book book) {
		return false;
	}
	
	/**
	 * This is a parameterized method that searches for a book by ISBN.
	 * @param ISBN
	 * 			This argument is the ISBN of the book
	 * @return
	 * 			Returns the book object if found.
	 * 			Returns null if the book object is not found
	 */
	public Book searchByISBN(String ISBN) {
		return null;
	}
	
	/**
	 * This is a method that prints details of all books using toString().
	 */
	public void displayBooks() {
		
	}

}
