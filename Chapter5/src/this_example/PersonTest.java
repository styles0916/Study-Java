package this_example;

public class PersonTest {

	public static void main(String[] args) {
		
		Person kim = new Person();
		kim.age = 30;
		kim.showInfo();
		System.out.println(kim);
		
		Person z = kim.getSelf();
		System.out.println(z);
		
		
		
		Person lee = new Person("LEE",20);
		lee.showInfo();
		System.out.println(lee); //������ �������� lee �� �޸� ���� �ּ�
		
		Person p = lee.getSelf();
		System.out.println(p); //return ���� this�� �޸� ���� �ּ�
	}
}
