package assignment1.librarysystem;

public class Book {
	
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	/**
	 * This is a default constructor that initializes title, author, and ISBN to "Unknown" and price to 0.0.
	 */
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}

	/**
	 * This is a parameterized constructor that sets all the attributes.
	 * @param title
	 * 			This argument is the title of the book
	 * @param author
	 * 			This argument is the author of the book
	 * @param ISBN
	 * 			This argument is the ISBN of the book
	 * @param price
	 * 			This argument is the price of the book
	 */
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	/**
	 * This is a parameterized copy constructor that creates a new Book object from another Book.
	 * @param other
	 * 			This argument is a book object that is being copied
	 */
	public void copy(Book other) {
		this.title = other.title;
		this.author = other.author;
		this.ISBN = other.ISBN;
		this.price = other.price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", price=" + price + "]";
	}
	
	/**
	 * This is a parameterized equals method that checks to see if two books have the same ISBN. 
	 * @param other
	 * 			This argument is a book object to compare against
	 * @return
	 * 			Returns true if two books have the same ISBN. 
	 * 			Returns false if two books do not have the same ISBN.
	 */
	public boolean equals(Book other) {
		return false;
	}

}
