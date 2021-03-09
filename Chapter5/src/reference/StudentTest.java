package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student lee = new Student(100, "lee");
		lee.setKoreaSubject("국어", 100);
		lee.setMathSubject("수학", 90);
		lee.setEngSubject("엉어", 80);
		
		Student kim = new Student(101, "kim");
		kim.setKoreaSubject("국어", 90);
		kim.setMathSubject("수학", 95);
		kim.setEngSubject("엉어", 95);
		
		lee.showStudentInfo();
		kim.showStudentInfo();
		
	}
}
