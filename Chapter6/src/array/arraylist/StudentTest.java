package array.arraylist;

public class StudentTest {

	public static void main(String[] args) {

		Student lee = new Student(100, "�̰���");
		Student kim = new Student(101, "�����");
		
		lee.addSubject("����", 100);
		lee.addSubject("����", 90);
		
		kim.addSubject("����", 100);
		kim.addSubject("����", 90);
		kim.addSubject("����", 80);
		
		lee.showStudentInfo();
		System.out.println("===============================");
		kim.showStudentInfo();
		
		
		
		
	}

}
