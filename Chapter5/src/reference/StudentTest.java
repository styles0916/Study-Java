package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student lee = new Student(100, "lee");
		lee.setKoreaSubject("����", 100);
		lee.setMathSubject("����", 90);
		lee.setEngSubject("����", 80);
		
		Student kim = new Student(101, "kim");
		kim.setKoreaSubject("����", 90);
		kim.setMathSubject("����", 95);
		kim.setEngSubject("����", 95);
		
		lee.showStudentInfo();
		kim.showStudentInfo();
		
	}
}
