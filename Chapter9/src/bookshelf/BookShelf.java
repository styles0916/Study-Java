package bookshelf;

public class BookShelf extends Shelf implements Queue{ //책장을 위한 선반을 상속 받고(extends), 구현하려는 기능의 인터페이스를 가져옴(implements).

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		
		return shelf.remove(0); //제일 앞에 것부터 반환. 책을 가져가서 사라짐.
	}

	@Override
	public int getSize() {
		return getCount();
	}
	

}
