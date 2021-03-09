package static_ex;

public class Student { 

	private static int serialNum = 1000;
	
	private int studentID;
	public String studentName; //private으로 작성하면, 변수를 해당 클래스 외부에서 참조는 할 수 없지만, 아래 생성자를 통해서는 해당 변수를 초기화(출력)할 수 있음.
	public String address;

	
	public Student() {/*body*/ //이렇게 따로 생성자를 만들어 주지 않으면, default constructor가 동일하게 생긴다. 
		serialNum++;
	} 
	
	public Student(String name) { //생성자 이름은 클래스 이름과 동일, 같은 이름의 다른 생성자 overloading
		studentName = name;
		address = "주소 없음";
		serialNum++;
		studentID = serialNum;
	}
	
	public Student(String name, String ads) { //생성자 이름은 클래스 이름과 동일, 같은 이름의 다른 생성자 overloading
		studentName = name;
		address = ads;
		serialNum++;
		studentID = serialNum;
	}
	
	public void showStudentInfo() {
		 System.out.println(studentID + "," + studentName + "," + address);
	}

	public int getID() {
		return studentID;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	
	

	/*public static void main(String[] args) {

		Student lee = new Student();
		lee.studentName = "이순신";
		lee.address = "서울";

		lee.showStudentInfo();

		Student kim = new Student();
		kim.studentName = "김유신";
		kim.address = "경주";

		kim.showStudentInfo();
	}*/
}