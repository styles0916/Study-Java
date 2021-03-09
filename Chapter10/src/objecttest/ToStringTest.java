package objecttest;

class Book implements Cloneable {
	String title;
	String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() { // Book class�� toString ������
		return author + "," + title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class ToStringTest { // compile ��, extends Object �ڵ� ����.

	public static void main(String[] args) throws CloneNotSupportedException {

		Book book = new Book("�ظ�����", "J.K.�Ѹ�");

		System.out.println(book); // Object.Book@28a418fc Object class�� toString method�� ����.
								  // Ŭ���� Ǯ���� @ �޸� �ּ�

		String str = new String("�ظ�����"); // String class�� Object�� toString�޼��尡 override, ������ �Ǿ��ֱ� ������ ���ڿ��� �״�� ��µȴ�.

		System.out.println(str); // �ظ�����
								 // str.toString() ����.

		System.out.println("==========");

		Book book2 = (Book) book.clone();
		System.out.println(book2);

		// error : Book Ŭ������ clone�� �������� ������ ��⶧��. clone�� ����Ϸ��� �ش� Ŭ������ implement
		// Cloneable�� ������Ѵ�.
	}

}