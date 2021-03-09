package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal { // [���]
	public void move() { // [�������̵�]
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}

	public void readBooks() {
		System.out.println("����� å�� �н��ϴ�.");
	}

}

class Tiger extends Animal { // [���]
	public void move() { // [�������̵�]
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}

	public void hunting() {
		System.out.println("ȣ���̴� ����� �մϴ�.");
	}

}

class Eagle extends Animal { // [���]
	public void move() { // [�������̵�]
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}

	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�.");
	}
}

//�� Ŭ������ Animal���� ����� ����

public class AnimalTest {

	public static void main(String[] args) {

		// Animal�� Human, Tiger, Eagle�� �����ϰ��ֱ⶧���� ��ó�� ���� ����. [���] [����ȯ]
		// ������ ����Ŭ�������� ����Ŭ������ �޼��带 �������̵�, ������ �� �� �ִ�. [�������̵�]
		// �������̵� ���� ��, �޼����� ȣ���� �ν��Ͻ��� �޼��尡 ȣ��ȴ�. [�����Լ�]

		Animal hAnimal = new Human(); // [����ȯ]
		Animal tAnimal = new Tiger(); // [����ȯ]
		Animal eAnimal = new Eagle(); // [����ȯ]

		Human human = (Human) hAnimal;
		human.readBooks();

		// Eagle tiger = (Eagle)tAnimal; //�����߻�
//		if (tAnimal instanceof Tiger) { //������
//			Tiger tiger = (Tiger) tAnimal;
//			tiger.hunting();
//		}

		System.out.println();

//		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);

		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal); // [�����Լ�]
		animalList.add(tAnimal); // [�����Լ�]
		animalList.add(eAnimal); // [�����Լ�]

		for (Animal animal : animalList) {
			animal.move(); // Animal Ÿ���� move�� �ƴ�, �� instance�� move. [polymorphism]
		}
		System.out.println();

		AnimalTest test = new AnimalTest(); // �޼��带 �������� ������ ����.
		test.downcatingTest(animalList);

	}

	public void downcatingTest(ArrayList<Animal> list) {
		for (int i = 0; i < list.size(); i++) {
			Animal ani = list.get(i);

			if (ani instanceof Human) {
				Human hAni = (Human) ani;
				hAni.readBooks();
			} else if (ani instanceof Tiger) {
				Tiger tAni = (Tiger) ani;
				tAni.hunting();
			} else if (ani instanceof Eagle) {
				Eagle eAni = (Eagle) ani;
				eAni.flying();
			} else {
				System.out.println("Error");
			}
		}
	}

	public void moveAnimal(Animal animal) {
		animal.move();
	}

} // �ϳ��� �ڵ尡 ���� �ڷ����� ������ �Ǿ� �ٸ� ������ �̷������ ���� polymorphism.
