package upload.week2;

public class Book {

	private static Book book = null;
	
	int id;
	String name;
	
	private Book(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static Book getInstance(int id, String name) {
		book = new Book(id, name);
		
		return book;
	}
	
	/*	private Book() {}
	
	public static Book getInstance() {
		if(book == null) {
		book = new Book();
		}
		return book;
	}
	
	public static Book makeBook(int id, String name) {
		book = new Book();
		book.id = id;
		book.name = name;
		return book;
	}*/
}
