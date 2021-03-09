package bookshelf;

public interface Queue {

	void enQueue(String title); //enQueue : 집어넣는 메서드
	String deQueue(); //deQueue : String 반환해주는 메서드
	
	int getSize();
}
