package chapter6;

public class StudentTest {

	public static void main(String[] args) {

		Student lee = new Student("�̰���");
		Student kim = new Student("�����");
		Student cho = new Student("������");
		
	
		lee.addBook("�¹���1", "a");
		lee.addBook("�¹���2", "a");
		
		kim.addBook("����1", "b");
		kim.addBook("����2", "b");
		kim.addBook("����3", "b");
		
		cho.addBook("�ظ�����1", "c");
		cho.addBook("�ظ�����2", "c");
		cho.addBook("�ظ�����3", "c");
		cho.addBook("�ظ�����4", "c");
		cho.addBook("�ظ�����5", "c");
		cho.addBook("�ظ�����6", "c");
		
		lee.showStudentInfo();
		kim.showStudentInfo();
		cho.showStudentInfo();
		
	}

}
