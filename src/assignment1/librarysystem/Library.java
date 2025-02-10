package assignment1.librarysystem;

public class Library {
	
	private Book[] books;
	private int count;
	
	/**
	 * This is a default constructor that initializes books with a fixed size of 5 and count to 0.
	 */
	public Library() {
		books = new Book[5];
		count = 0;
	}
	
	/**
	 * This is a parameterized method that adds a book to the array (if there is space).
	 * @param book
	 * 			This argument is the book object to add
	 * @return
	 * 			Returns true if the book was added properly.
	 * 			Returns false if the book could not be added.
	 */
	public boolean addBook(Book book) {
		if(book == null || count >= 5) {
			return false;
		}
		
		for(int i = 0; i < count; i++) {
			if(books[i].equals(book)) {
				return false;
			}
		}
		
		books[count] = new Book(book);
		count++;
		return true;
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
		if(book == null) {
			return false;
		}
		
		for(int i = 0; i < count; i++) {
			if(books[i].equals(book)) {
				for(int j = i; j <count - 1; j++) {
					books[j] = books[j+1];
				}
				books[count - 1] = null;
				count--;
				return true;
			}
		}
		
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
		if(ISBN == null) {
			return null;
		}
		
		for(int i = 0; i < count; i++) {
			if(books[i].getISBN().equals(ISBN)) {
				return new Book(books[i]);
			}
		}
		
		return null;
	}
	
	/**
	 * This is a method that prints details of all books using toString().
	 */
	public void displayBooks() {
		if(count == 0) {
			System.out.println("Library is empty.");
			return;
		}
		
		System.out.println("All books in the library:");
		for(int i = 0; i < count; i++) {
			System.out.println(+count+ ". " +books[i].toString());
		}
	}

}
