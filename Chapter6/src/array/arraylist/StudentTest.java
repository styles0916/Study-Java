package array.arraylist;

public class StudentTest {

	public static void main(String[] args) {

		Student lee = new Student(100, "이강인");
		Student kim = new Student(101, "김민재");
		
		lee.addSubject("국어", 100);
		lee.addSubject("영어", 90);
		
		kim.addSubject("국어", 100);
		kim.addSubject("수학", 90);
		kim.addSubject("영어", 80);
		
		lee.showStudentInfo();
		System.out.println("===============================");
		kim.showStudentInfo();
		
		
		
		
	}

}
