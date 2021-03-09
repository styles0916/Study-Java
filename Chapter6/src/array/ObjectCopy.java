package array;

public class ObjectCopy { 
	
	//���� ����!!

	public static void main(String[] args) {

		Book[] library = new Book[5]; // ��������ϸ� å ���� x
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("�ظ�����", "J.K.�Ѹ�"); // �ϳ��ϳ� new�� �����������.
		library[1] = new Book("����", "�ٶ�");
		library[2] = new Book("����", "���");
		library[3] = new Book("����", "īŸ");
		library[4] = new Book("��", "��");

		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
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
