package library;

public class Book
{
	// instance variables/attributes
	private String isbn;
	private String author;
	private String title;
	private int edition;
	// to keep track of how many books we have/create
	// example of static/class variable
	private static long bookCounter = 0;
	
	/*
	public Book()
	{ }
	*/
	
	public Book(String isbn, String author, String title, int edition)
	{
		this.isbn = isbn;
		this.author = author;
		this.title = title;
		this.edition = edition;
		bookCounter++;
		
	}
	
	// returns the number of books instantiated
	// (exmample of static method)
	public static long getTotalBooks()
	{
		return bookCounter;
	}

	public String getIsbn()
	{
		return isbn;
	}

	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public int getEdition()
	{
		return edition;
	}

	public void setEdition(int edition)
	{
		this.edition = edition;
	}

	
	/*
	public String toString() {
		return "Book [isbn=" + isbn + ", author=" + author + ", title=" + title + ", edition=" + edition + "]";
	}
	*/
	
	@Override
	public String toString()
	{
		return  "ISBN: " + this.isbn + "\nTitle: " + this.title +
				"Edition: " + this.edition + "\nAuthor: " + this.author;
	}
	
	
	
	
}
