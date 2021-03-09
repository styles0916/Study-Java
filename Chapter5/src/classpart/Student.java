package classpart;

public class Student { 

	public String studentID;
	private String studentName; //private���� �ۼ��ϸ�, ������ �ش� Ŭ���� �ܺο��� ������ �� �� ������, �Ʒ� �����ڸ� ���ؼ��� �ش� ������ �ʱ�ȭ(���)�� �� ����.
	public String address;

	
	public Student() {/*body*/} //�̷��� ���� �����ڸ� ����� ���� ������, default constructor�� �����ϰ� �����. 
	
	public Student(String name) { //������ �̸��� Ŭ���� �̸��� ����, ���� �̸��� �ٸ� ������ overloading
		studentName = name;
		address = "�ּ� ����";
		studentID = "ID ����"; 
	}
	
	public Student(String name, String ads) { //������ �̸��� Ŭ���� �̸��� ����, ���� �̸��� �ٸ� ������ overloading
		studentName = name;
		address = ads;
		studentID = "ID ����";
	}
	
	public void showStudentInfo() {
		 System.out.println(studentID + "," + studentName + "," + address);
	}


	/*public static void main(String[] args) {

		Student lee = new Student();
		lee.studentName = "�̼���";
		lee.address = "����";

		lee.showStudentInfo();

		Student kim = new Student();
		kim.studentName = "������";
		kim.address = "����";

		kim.showStudentInfo();
	}*/
}