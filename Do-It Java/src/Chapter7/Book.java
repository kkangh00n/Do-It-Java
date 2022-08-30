package Chapter7;

public class Book {
	private String bookName;
	private String Author;
	
	public Book() {}
	
	public Book(String bookName, String Author){
		this.bookName = bookName;
		this.Author = Author;
	}
	
	public String getBookName()
	{
		return this.bookName;
	}
	public String getAuthor() {
		return this.Author;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAuthor(String Author) {
		this.Author = Author;
	}
}
