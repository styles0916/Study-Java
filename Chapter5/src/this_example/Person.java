package this_example;

public class Person {

	String name;
	int age;
	
	public Person() {
		this("�̸� ����", 1); //�ʱ�ȭ. �Ʒ��� constructor�� ȣ��. �̷������� �� ����, �� ������ first statement���� �Ѵ�. ��ܿ� �ٸ� ���� ���� �ȵ�.
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name + ", " + age + "��");
	}
	
	public Person getSelf() {
		return this;
	}
}

