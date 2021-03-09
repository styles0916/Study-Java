package static_ex;

public class StudentIDTest {

	public static void main(String[] args) {
		

		Student lee = new Student("lee");
		lee.showStudentInfo();
		
		Student kim = new Student("kim");
		kim.showStudentInfo();
		lee.showStudentInfo();
		
		System.out.println(lee.getID());
		System.out.println(kim.getID());
		
		System.out.println(lee.getSerialNum()); //static 변수는 공통으로 사용되는 것이기에 참조 시, 해당 클래스 이름으로 참조. 이렇게 출력하면 이것은 lee의 serialNum을 출력하는 것이 아니라, static serialNum을 출력하는 것이므로 1002가 나온다.
		System.out.println(Student.getSerialNum()); //static 변수는 공통으로 사용되는 것이기에 참조 시, 해당 클래스 이름으로 참조.
	
	}
	
}
 