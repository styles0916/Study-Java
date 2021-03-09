package objecttest;

class Book implements Cloneable {
	String title;
	String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() { // Book class의 toString 재정의
		return author + "," + title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class ToStringTest { // compile 시, extends Object 자동 적용.

	public static void main(String[] args) throws CloneNotSupportedException {

		Book book = new Book("해리포터", "J.K.롤링");

		System.out.println(book); // Object.Book@28a418fc Object class의 toString method의 원형.
								  // 클래스 풀네임 @ 메모리 주소

		String str = new String("해리포터"); // String class는 Object의 toString메서드가 override, 재정의 되어있기 때문에 문자열이 그대로 출력된다.

		System.out.println(str); // 해리포터
								 // str.toString() 생략.

		System.out.println("==========");

		Book book2 = (Book) book.clone();
		System.out.println(book2);

		// error : Book 클래스는 clone이 가능하지 않은데 썼기때문. clone을 사용하려면 해당 클래스에 implement
		// Cloneable를 써줘야한다.
	}

}