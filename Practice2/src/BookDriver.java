/**
 * 
 */
import java.util.Scanner;

//Client Class/Driver Class

public class BookDriver {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Book b1 = new Book();
		Book b2 = new Book("Diary of a Wimpy Kid", "Geoff Keighly", "12345ABCDE", 45, 12.65);
		
		String bookName;
		String author;
		String isbn;
		int numOfPages;
		double price;
		
		//Asks the user for their input
		System.out.println("What is the name of your book? ");
		bookName = in.nextLine();
		
		b1.setName(bookName);
		
		//Ask user for the author
		System.out.println("Who is the Author? ");
		author = in.nextLine();
		
		b1.setAuthor(author);
		
		//Ask user for the ISBN
		System.out.println("What is the isbn?");
		isbn = in.nextLine();
		
		b1.setIsbn(isbn);
		
		//Ask user for the number of pages
		System.out.println("Total number of pages?");
		numOfPages = in.nextInt();
		
		b1.setNumOfPages(numOfPages);
		
		//Asks user for the price
		System.out.println("The price for the book?");
		price = in.nextDouble();
		
		b1.setPrice(price);
		
		System.out.println("This is the info for the book ");
		
		for(int i = 0; i < 10; i++) {
			
			System.out.print("-");
			
		}
		
		System.out.println(b1.toString());
				
		
		
	}

}