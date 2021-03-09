package reference;

public class Student {

	int studentID;
	String studentName;
	
//	int koreaScore;
//	int mathScore;
//	int engScore;
//	
//	String koreaName;
//	String mathName;
//	String engName; 학생 class인지 과목 class인지 모호, 좋은 코드 디자인이 아님.
	
	Subject korea = new Subject(); //String과는 다르게 생성자를 만들어주어야 함
	Subject math = new Subject();
	Subject eng = new Subject();;
	
	
	public Student(int id, String name) { 
		studentID = id;
		studentName = name;
	}
	
	public void setKoreaSubject(String name, int score){
 		korea.subjectName = name;
 		korea.score = score;
  	}

	public void setMathSubject(String name, int score){
 		math.subjectName = name;
 		math.score = score;
  	}
	
	public void setEngSubject(String name, int score){
 		eng.subjectName = name;
 		eng.score = score;
  	}
	 
	public void showStudentInfo() {
		int total = korea.score + math.score + eng.score;
		System.out.println(studentName + "학생의 총점은 " + total +"점 입니다.");
	}
}
