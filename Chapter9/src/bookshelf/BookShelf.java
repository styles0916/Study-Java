package bookshelf;

public class BookShelf extends Shelf implements Queue{ //å���� ���� ������ ��� �ް�(extends), �����Ϸ��� ����� �������̽��� ������(implements).

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		
		return shelf.remove(0); //���� �տ� �ͺ��� ��ȯ. å�� �������� �����.
	}

	@Override
	public int getSize() {
		return getCount();
	}
	

}
