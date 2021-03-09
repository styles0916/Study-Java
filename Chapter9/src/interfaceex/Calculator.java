package interfaceex;

public abstract class Calculator implements Calc { //클래스를 상속하는게 아니기때문에 extends가 아니라 implements
	//메서드 4개 중 2개는 구현을 했지만, 2개를 구현하지 않았기 때문에 abstract class가 됨.

	@Override
	public int addition(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substraction(int num1, int num2) {
		return num1 - num2;
	}
}
