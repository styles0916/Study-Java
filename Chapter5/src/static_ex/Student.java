package static_ex;

public class Student { 

	private static int serialNum = 1000;
	
	private int studentID;
	public String studentName; //private���� �ۼ��ϸ�, ������ �ش� Ŭ���� �ܺο��� ������ �� �� ������, �Ʒ� �����ڸ� ���ؼ��� �ش� ������ �ʱ�ȭ(���)�� �� ����.
	public String address;

	
	public Student() {/*body*/ //�̷��� ���� �����ڸ� ����� ���� ������, default constructor�� �����ϰ� �����. 
		serialNum++;
	} 
	
	public Student(String name) { //������ �̸��� Ŭ���� �̸��� ����, ���� �̸��� �ٸ� ������ overloading
		studentName = name;
		address = "�ּ� ����";
		serialNum++;
		studentID = serialNum;
	}
	
	public Student(String name, String ads) { //������ �̸��� Ŭ���� �̸��� ����, ���� �̸��� �ٸ� ������ overloading
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
		lee.studentName = "�̼���";
		lee.address = "����";

		lee.showStudentInfo();

		Student kim = new Student();
		kim.studentName = "������";
		kim.address = "����";

		kim.showStudentInfo();
	}*/
}