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
//	String engName; �л� class���� ���� class���� ��ȣ, ���� �ڵ� �������� �ƴ�.
	
	Subject korea = new Subject(); //String���� �ٸ��� �����ڸ� ������־�� ��
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
		System.out.println(studentName + "�л��� ������ " + total +"�� �Դϴ�.");
	}
}
