//Data Element

public class Book {

	/**
	 * Variables for the book class
	 * @param name, book title
	 * @param author, author of book
	 * @param isbn, book number
	 * @param numOfPages, number of pages in the book
	 * @param price, cost of book
	 */
	private String name;
	private String author;
	private String isbn;
	private int numOfPages;
	private double price;
	
	private int count;
	
	/*
	 * No arg constructor
	 */
	public Book() {
		
		numOfPages = 0;
		price = 0.0;
		count++;
	}
	
	/**
	 * Overloaded constructor
	 * @param name
	 * @param author
	 * @param isbn
	 * @param numOfPages
	 * @param price
	 */
	public Book(String name, String author, String isbn, int numOfPages, double price) {
		
		this.author = author;
		this.isbn = isbn;
		this.name = name;
		this.numOfPages = numOfPages;
		this.price = price;
		count++;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public double getPrice() {
		return price;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Book name = " + name + "\nauthor = " + author + "\nisbn=" + isbn + "\nnumOfPages=" + numOfPages
				+ "\nprice=" + price + "\ncount=" + count;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	

}