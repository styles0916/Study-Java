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
		
		System.out.println(lee.getSerialNum()); //static ������ �������� ���Ǵ� ���̱⿡ ���� ��, �ش� Ŭ���� �̸����� ����. �̷��� ����ϸ� �̰��� lee�� serialNum�� ����ϴ� ���� �ƴ϶�, static serialNum�� ����ϴ� ���̹Ƿ� 1002�� ���´�.
		System.out.println(Student.getSerialNum()); //static ������ �������� ���Ǵ� ���̱⿡ ���� ��, �ش� Ŭ���� �̸����� ����.
	
	}
	
}
 