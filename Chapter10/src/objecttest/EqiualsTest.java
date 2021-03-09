package objecttest;

class Student {
	int studentNumber;
	String studentName;

	public Student(int studentNumber, String studentName) {
		this.studentName = studentName;
		this.studentNumber = studentNumber;
	}

	@Override // 재정의한 equals
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student) obj;
//			return (this.studentNumber == stu.studentNumber); 또는,
			if (this.studentNumber == stu.studentNumber && this.studentName == stu.studentName) {
				return true;
			} else
				return false;
		}
		return false;
	} // 입력받는 Object obj를 Student class로 다운캐스팅하고, Student constructor의 studentNumber
	  // 값과 비교하도록 함.

	@Override
	public int hashCode() {
		return studentNumber;
	} // hashCode를 override할 때, equals에 쓴 멤버변수를 활용하면 좋다.
}

public class EqiualsTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1);
		System.out.println(str2);

		System.out.println(str1 == str2); // 메모리 주소가 같은 것인가를 물어보는 것. false.
		System.out.println(str1.equals(str2)); // equals의 원형은 '==' Object의 메서드 원형.
											   // String class에서 재정의한 equals. 두개의 '문자열'이 같은가를 비교. true.
		System.out.println("==========");

		Student lee = new Student(200, "이강인");
		Student lee2 = lee;
		Student lee3 = new Student(200, "이강인");

		System.out.println(lee == lee2); // true
		System.out.println(lee == lee3); // false
		System.out.println(lee.equals(lee3)); // 재정의한 Student class의 equals method.
		System.out.println();
		System.out.println(lee);
		System.out.println(lee3);

		System.out.println(lee.hashCode());
		System.out.println(lee3.hashCode());
		System.out.println(System.identityHashCode(lee)); // 진짜 메모리 주소.
		System.out.println(System.identityHashCode(lee3));
		System.out.println("==========");

		Integer i1 = 100;
		Integer i2 = 100;

		System.out.println(i1.equals(i2)); // true
		System.out.println(i1.hashCode()); // 100
		System.out.println(i2.hashCode()); // 100
		// equals 값이 true일 때, hashCode값도 같도록 override 한다.
	}
}
