package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student lee = new Student("이순신"); 
//		lee.studentName = "이순신";
		lee.address = "서울";
		
		lee.showStudentInfo(); 
	
		Student kim = new Student("김유신", "경주");
//		kim.studentName = "김유신";
//		kim.address = "경주";
		
		kim.showStudentInfo();
		
		Student son = new Student();
//		son.studentName = "손흥민"; //private으로 작성했기 때문에 해당 변수는 참조할 수 없다.
		son.address = "토트넘";
		
		son.showStudentInfo();
		
		System.out.println(lee); //패키지이름.클래스이름@Heap 메모리 가상 주소 값 (참조값)
		System.out.println(kim );//패키지이름.클래스이름@Heap 메모리 가상 주소 값 (참조값)
	}
	
}  
