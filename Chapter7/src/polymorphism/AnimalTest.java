package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal { // [상속]
	public void move() { // [오버라이딩]
		System.out.println("사람이 두 발로 걷습니다.");
	}

	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}

}

class Tiger extends Animal { // [상속]
	public void move() { // [오버라이딩]
		System.out.println("호랑이가 네 발로 뜁니다.");
	}

	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다.");
	}

}

class Eagle extends Animal { // [상속]
	public void move() { // [오버라이딩]
		System.out.println("독수리가 하늘을 날아갑니다.");
	}

	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

//각 클래스가 Animal에서 상속을 받음

public class AnimalTest {

	public static void main(String[] args) {

		// Animal이 Human, Tiger, Eagle를 내포하고있기때문에 이처럼 생성 가능. [상속] [형변환]
		// 각각의 하위클래스에서 상위클래스의 메서드를 오버라이딩, 재정의 할 수 있다. [오버라이딩]
		// 오버라이딩 했을 때, 메서드의 호출은 인스턴스의 메서드가 호출된다. [가상함수]

		Animal hAnimal = new Human(); // [형변환]
		Animal tAnimal = new Tiger(); // [형변환]
		Animal eAnimal = new Eagle(); // [형변환]

		Human human = (Human) hAnimal;
		human.readBooks();

		// Eagle tiger = (Eagle)tAnimal; //오류발생
//		if (tAnimal instanceof Tiger) { //안정성
//			Tiger tiger = (Tiger) tAnimal;
//			tiger.hunting();
//		}

		System.out.println();

//		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);

		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal); // [가상함수]
		animalList.add(tAnimal); // [가상함수]
		animalList.add(eAnimal); // [가상함수]

		for (Animal animal : animalList) {
			animal.move(); // Animal 타입의 move가 아닌, 각 instance의 move. [polymorphism]
		}
		System.out.println();

		AnimalTest test = new AnimalTest(); // 메서드를 쓰기위해 생성자 만듬.
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

} // 하나의 코드가 여러 자료형이 구현이 되어 다른 실행이 이루어지는 것이 polymorphism.
