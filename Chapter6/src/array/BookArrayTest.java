package array;

public class BookArrayTest {

	public static void main(String[] args) {

		Book[] library = new Book[5]; //��������ϸ� å ���� x
		
		library[0] = new Book("�ظ�����", "J.K.�Ѹ�"); //�ϳ��ϳ� new�� �����������.
		library[1] = new Book("����", "�ٶ�");
		library[2] = new Book("����", "���");
		library[3] = new Book("����", "īŸ");
		library[4] = new Book("��", "��");
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
	}
}
