package objecttest;

class Student {
	int studentNumber;
	String studentName;

	public Student(int studentNumber, String studentName) {
		this.studentName = studentName;
		this.studentNumber = studentNumber;
	}

	@Override // �������� equals
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student) obj;
//			return (this.studentNumber == stu.studentNumber); �Ǵ�,
			if (this.studentNumber == stu.studentNumber && this.studentName == stu.studentName) {
				return true;
			} else
				return false;
		}
		return false;
	} // �Է¹޴� Object obj�� Student class�� �ٿ�ĳ�����ϰ�, Student constructor�� studentNumber
	  // ���� ���ϵ��� ��.

	@Override
	public int hashCode() {
		return studentNumber;
	} // hashCode�� override�� ��, equals�� �� ��������� Ȱ���ϸ� ����.
}

public class EqiualsTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1);
		System.out.println(str2);

		System.out.println(str1 == str2); // �޸� �ּҰ� ���� ���ΰ��� ����� ��. false.
		System.out.println(str1.equals(str2)); // equals�� ������ '==' Object�� �޼��� ����.
											   // String class���� �������� equals. �ΰ��� '���ڿ�'�� �������� ��. true.
		System.out.println("==========");

		Student lee = new Student(200, "�̰���");
		Student lee2 = lee;
		Student lee3 = new Student(200, "�̰���");

		System.out.println(lee == lee2); // true
		System.out.println(lee == lee3); // false
		System.out.println(lee.equals(lee3)); // �������� Student class�� equals method.
		System.out.println();
		System.out.println(lee);
		System.out.println(lee3);

		System.out.println(lee.hashCode());
		System.out.println(lee3.hashCode());
		System.out.println(System.identityHashCode(lee)); // ��¥ �޸� �ּ�.
		System.out.println(System.identityHashCode(lee3));
		System.out.println("==========");

		Integer i1 = 100;
		Integer i2 = 100;

		System.out.println(i1.equals(i2)); // true
		System.out.println(i1.hashCode()); // 100
		System.out.println(i2.hashCode()); // 100
		// equals ���� true�� ��, hashCode���� ������ override �Ѵ�.
	}
}
