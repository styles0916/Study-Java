package array;

public class ObjectCopy2 {

	//���� ����!!
	
	public static void main(String[] args) {

		Book[] library = new Book[5]; // ��������ϸ� å ���� x
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("�ظ�����", "J.K.�Ѹ�"); // �ϳ��ϳ� new�� �����������.
		library[1] = new Book("����", "�ٶ�");
		library[2] = new Book("����", "���");
		library[3] = new Book("����", "īŸ");
		library[4] = new Book("��", "��");

		copyLibrary[0] = new Book(); //å�� ����� ���� �Ʒ����� ���� �ֱ�.
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i = 0; i <library.length; i++) {
			copyLibrary[i].setTtitle(library[i].getTitle()); //get, set ���� ������
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}

		System.out.println("==============");
		
		library[0].setTtitle("������ ����");
		library[0].setAuthor("���� �轼");
		 
		for(Book book : library) {
			book.showBookInfo(); 
		}
		
		System.out.println("==============");
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}
	}
}
