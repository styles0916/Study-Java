package bookshelf;

public class BookShelfTest {
	public static void main(String[] args) {
		
		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("�ظ�����");
		bookQueue.enQueue("����������");
		bookQueue.enQueue("���Ͼƿ����");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}
}
