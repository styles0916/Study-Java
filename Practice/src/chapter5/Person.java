package chapter5;

public class Person {
	int age;
	String name;
	boolean married;
	int numberOfChild;
	
	public void personInfo() {
		System.out.println("���� : " + age);
		System.out.println("�̸� : " + name);
		System.out.println("��ȥ���� : " + married);
		System.out.println("�ڳ� �� : " + numberOfChild);
	}
	
	public void printMyChildren() {
		if(married) {
			if(numberOfChild > 0) {
				System.out.println("���� ��ȥ�̰�, �ڳ�� " + numberOfChild + "�� �Դϴ�.");
			} else {
				System.out.println("���� ��ȥ�Դϴ�.");
			}
		} else {
			System.out.println("���� ��ȥ�Դϴ�.");
		}
	}
}
