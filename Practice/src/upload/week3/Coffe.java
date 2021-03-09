package upload.week3;

import java.io.IOException;

abstract class CreateCoffe {

	void boilWater() {
		System.out.println("���� ���Դϴ�.");
	}

	abstract void brew();
	abstract void pourInCup();

	final public void create() {

		boilWater();
		brew();
		pourInCup();

	}
}

class Americano extends CreateCoffe {

	@Override
	void brew() {
		System.out.println("�Ƹ޸�ī�븦 ����ϴ�.");
	}

	@Override
	void pourInCup() {
		System.out.println("�Ƹ޸�ī�븦 �ſ� �����ϴ�.");
	}
	
}

class Latte extends CreateCoffe {

	@Override
	void brew() {
		System.out.println("�󶼸� ����ϴ�.");
	}

	@Override
	void pourInCup() {
		System.out.println("�󶼸� �ſ� �����ϴ�.");
	}
	
}

public class Coffe {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("�޴��� �����ϼ���.");
		System.out.println("A : Americano");
		System.out.println("L : Latte");
		
		int ch = System.in.read();
		
		CreateCoffe coffe = null;
		
		if(ch == 'A' || ch == 'a') {
			coffe = new Americano();
		} else if(ch == 'L' || ch == 'l') {
			coffe = new Latte();
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		} coffe.create();
	}
}
