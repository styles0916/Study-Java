package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student lee = new Student("�̼���"); 
//		lee.studentName = "�̼���";
		lee.address = "����";
		
		lee.showStudentInfo(); 
	
		Student kim = new Student("������", "����");
//		kim.studentName = "������";
//		kim.address = "����";
		
		kim.showStudentInfo();
		
		Student son = new Student();
//		son.studentName = "�����"; //private���� �ۼ��߱� ������ �ش� ������ ������ �� ����.
		son.address = "��Ʈ��";
		
		son.showStudentInfo();
		
		System.out.println(lee); //��Ű���̸�.Ŭ�����̸�@Heap �޸� ���� �ּ� �� (������)
		System.out.println(kim );//��Ű���̸�.Ŭ�����̸�@Heap �޸� ���� �ּ� �� (������)
	}
	
}  
