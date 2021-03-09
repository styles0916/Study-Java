package array;

public class BookArrayTest {

	public static void main(String[] args) {

		Book[] library = new Book[5]; //여기까지하면 책 생성 x
		
		library[0] = new Book("해리포터", "J.K.롤링"); //하나하나 new로 생성해줘야함.
		library[1] = new Book("가나", "다라");
		library[2] = new Book("마바", "사아");
		library[3] = new Book("자차", "카타");
		library[4] = new Book("파", "하");
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
	}
}
