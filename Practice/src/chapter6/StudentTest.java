package chapter6;

public class StudentTest {

	public static void main(String[] args) {

		Student lee = new Student("이강인");
		Student kim = new Student("김민재");
		Student cho = new Student("조현우");
		
	
		lee.addBook("태백산맥1", "a");
		lee.addBook("태백산맥2", "a");
		
		kim.addBook("토지1", "b");
		kim.addBook("토지2", "b");
		kim.addBook("토지3", "b");
		
		cho.addBook("해리포터1", "c");
		cho.addBook("해리포터2", "c");
		cho.addBook("해리포터3", "c");
		cho.addBook("해리포터4", "c");
		cho.addBook("해리포터5", "c");
		cho.addBook("해리포터6", "c");
		
		lee.showStudentInfo();
		kim.showStudentInfo();
		cho.showStudentInfo();
		
	}

}
