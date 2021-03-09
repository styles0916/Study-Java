package bookshelf;

public class BookShelfTest {
	public static void main(String[] args) {
		
		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("해리포터");
		bookQueue.enQueue("반지의제왕");
		bookQueue.enQueue("나니아연대기");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}
}
