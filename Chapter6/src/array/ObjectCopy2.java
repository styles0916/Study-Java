package array;

public class ObjectCopy2 {

	//깊은 복사!!
	
	public static void main(String[] args) {

		Book[] library = new Book[5]; // 여기까지하면 책 생성 x
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("해리포터", "J.K.롤링"); // 하나하나 new로 생성해줘야함.
		library[1] = new Book("가나", "다라");
		library[2] = new Book("마바", "사아");
		library[3] = new Book("자차", "카타");
		library[4] = new Book("파", "하");

		copyLibrary[0] = new Book(); //책을 만들어 놓고 아래에서 정보 넣기.
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i = 0; i <library.length; i++) {
			copyLibrary[i].setTtitle(library[i].getTitle()); //get, set 개념 익히기
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}

		System.out.println("==============");
		
		library[0].setTtitle("반지의 제왕");
		library[0].setAuthor("피터 잭슨");
		 
		for(Book book : library) {
			book.showBookInfo(); 
		}
		
		System.out.println("==============");
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}
	}
}
