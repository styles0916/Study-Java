package bookshelf;

public interface Queue {

	void enQueue(String title); //enQueue : ����ִ� �޼���
	String deQueue(); //deQueue : String ��ȯ���ִ� �޼���
	
	int getSize();
}
