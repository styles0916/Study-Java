package upload.week3;

import java.io.IOException;

abstract class CreateCoffe {

	void boilWater() {
		System.out.println("물을 끓입니다.");
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
		System.out.println("아메리카노를 만듭니다.");
	}

	@Override
	void pourInCup() {
		System.out.println("아메리카노를 컵에 따릅니다.");
	}
	
}

class Latte extends CreateCoffe {

	@Override
	void brew() {
		System.out.println("라떼를 만듭니다.");
	}

	@Override
	void pourInCup() {
		System.out.println("라떼를 컵에 따릅니다.");
	}
	
}

public class Coffe {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("메뉴를 선택하세요.");
		System.out.println("A : Americano");
		System.out.println("L : Latte");
		
		int ch = System.in.read();
		
		CreateCoffe coffe = null;
		
		if(ch == 'A' || ch == 'a') {
			coffe = new Americano();
		} else if(ch == 'L' || ch == 'l') {
			coffe = new Latte();
		} else {
			System.out.println("잘못된 입력입니다.");
			return;
		} coffe.create();
	}
}
